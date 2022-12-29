package com.easyspring.beans.factory;

public interface BeanFactory {

    void registerBean(String name, Object bean);

    Object getBean(String name);
}
