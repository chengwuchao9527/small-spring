package com.cheng.factory;

import com.cheng.BeansException;

/**
 * @author chengwuchao
 * @date 2022/1/6
 */
public interface BeanFactory {

    /**
     * 获取bean
     * @param beanName
     * @return
     */
    Object getBean(String beanName) throws BeansException;

    /**
     * 获取bean（有参构造）
     * @param beanName
     * @param args
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName, Object... args) throws BeansException;
}
