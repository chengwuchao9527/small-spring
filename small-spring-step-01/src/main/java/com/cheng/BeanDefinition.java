package com.cheng;


/**
 * bean的定义
 * @author chengwuchao
 * @date 2022/1/4
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
