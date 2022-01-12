package com.cheng.factory.config;

/**
 * Bean的引用
 * @author chengwuchao
 * @date 2022/1/11
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }
    public String getBeanName(){
        return beanName;
    }
}
