package com.cheng.factory.config;

import com.cheng.PropertyValues;

/**
 * bean的定义
 * @author chengwuchao
 * @date 2022/1/6
 */
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues){
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public void setBeanClass(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass(){
        return this.beanClass;
    }

    public PropertyValues getPropertyValues(){
        return this.propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues){
        this.propertyValues = propertyValues;
    }
}
