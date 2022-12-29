package com.easyspring.beans.factory;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
