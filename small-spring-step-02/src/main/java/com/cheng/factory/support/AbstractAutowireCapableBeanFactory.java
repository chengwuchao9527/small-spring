package com.cheng.factory.support;

import com.cheng.BeansException;
import com.cheng.factory.config.BeanDefinition;

/**
 * 实例化bean类
 * @author chengwuchao
 * @date 2022/1/6
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object creatBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        }catch (InstantiationException | IllegalAccessException e){
            throw new BeansException("Instantiation of bean failed", e);
        }

        //添加单例bean的缓存
        sddSingleten(beanName, bean);
        return bean;
    }
}
