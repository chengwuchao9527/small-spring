package com.cheng.factory.support;

import com.cheng.factory.config.BeanDefinition;

/**
 * @author chengwuchao
 * @date 2022/1/6
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
