package com.cheng.factory.support;

import com.cheng.BeansException;
import com.cheng.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 实例化策略接口
 * @author chengwuchao
 * @date 2022/1/10
 */
public interface InstantiationStrategy {

    /**
     * 实例化方法
     * @param beanDefinition bean的定义
     * @param beanName bean的名称
     * @param ctor 构造方法
     * @param args 构造参数
     * @return
     * @throws BeansException
     */
    Object instantiation(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
