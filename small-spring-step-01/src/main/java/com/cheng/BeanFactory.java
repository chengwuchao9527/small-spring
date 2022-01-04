package com.cheng;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * bean工厂
 * @author chengwuchao
 * @date 2022/1/4
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }
}
