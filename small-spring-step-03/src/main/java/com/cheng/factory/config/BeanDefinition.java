package com.cheng.factory.config;

/**
 * bean的定义
 * @author chengwuchao
 * @date 2022/1/6
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

    public void setBeanClass(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass(){
        return this.beanClass;
    }
}
