package com.cheng.factory.config;

/**
 * 单例注册接口
 * @author chengwuchao
 * @date 2022/1/6
 */
public interface SingletenBeanRegistry {

    /**
     * 获取单例bean
     * @param beanName
     * @return
     */
    Object getSingleten(String beanName);
}
