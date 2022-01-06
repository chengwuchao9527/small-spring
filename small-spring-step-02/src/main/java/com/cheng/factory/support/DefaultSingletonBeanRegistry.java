package com.cheng.factory.support;

import com.cheng.factory.config.SingletenBeanRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 默认的单例bean注册
 * @author chengwuchao
 * @date 2022/1/6
 */
public class DefaultSingletonBeanRegistry implements SingletenBeanRegistry {

    private Map<String, Object> singletenObjects = new ConcurrentHashMap<>();

    @Override
    public Object getSingleten(String beanName) {
        return singletenObjects.get(beanName);
    }

    protected void sddSingleten(String beanName, Object singletenObject){
        singletenObjects.put(beanName, singletenObject);
    }
}
