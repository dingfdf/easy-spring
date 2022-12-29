package com.easyspring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ding Fan
 * @version V1.0.0
 * @date 2022/12/27
 */
public class SimpleBeanFactory implements BeanFactory {

    private Map<String, Object> beanMap = new HashMap<>();

    @Override
    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    @Override
    public Object getBean(String name) {
        return beanMap.get(name);
    }
}
