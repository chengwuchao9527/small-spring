package com.cheng;

import com.cheng.bean.UserService;
import com.cheng.factory.config.BeanDefinition;
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

        //2、注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3、获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "测试");
        userService.queryUserInfo();
    }
}
