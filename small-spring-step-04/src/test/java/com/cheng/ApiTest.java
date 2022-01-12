package com.cheng;

import com.cheng.bean.UserDao;
import com.cheng.bean.UserService;
import com.cheng.factory.config.BeanDefinition;
import com.cheng.factory.config.BeanReference;
import com.cheng.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author chengwuchao
 * @date 2022/1/10
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //1、初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2、UserDao注册
        BeanDefinition beanDefinition = new BeanDefinition(UserDao.class);
        beanFactory.registerBeanDefinition("userDao", beanDefinition);

        //3、UserService设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        //4、UserService 注入Bean
        BeanDefinition userServiceBeanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", userServiceBeanDefinition);

        //5、UserService获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "测试");
        userService.queryUserInfo();
    }
}
