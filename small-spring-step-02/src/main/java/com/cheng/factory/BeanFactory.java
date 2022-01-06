package com.cheng.factory;

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
    Object getBean(String beanName);
}
