package com.cheng.factory.support;

import com.cheng.BeansException;
import com.cheng.factory.BeanFactory;
import com.cheng.factory.config.BeanDefinition;

/**
 * 抽象类定义模板方法
 * 1、单例缓存中获取bean
 * 2、未获取到根据beanName 获取bean的实例化
 * 3、实例化bean
 * @author chengwuchao
 * @date 2022/1/6
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {
        Object bean = getSingleten(name);

        //如果缓存中有直接取
        if (bean != null){
            return bean;
        }

        //缓存中没有需要取去实例化（由子类实现）
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return creatBean(name, beanDefinition);
    }

    /**
     * 根据beanName获取bean的定义
     * @param beanName
     * @return
     * @throws BeansException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 实例化bean
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    protected abstract Object creatBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
