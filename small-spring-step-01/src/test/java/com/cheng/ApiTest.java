package com.cheng;

import com.cheng.bean.UserService;
import org.junit.Test;

/**
 * @author chengwuchao
 * @date 2022/1/4
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.queryUserInfo();
    }
}
