package com.cheng;

import com.cheng.bean.UserService;
import com.cheng.factory.config.BeanDefinition;
import com.cheng.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author chengwuchao
 * @date 2022/1/6
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //1、初始化beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2、注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3、第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        //4、第二次获取bean
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
