package com.easyspring.beans.factory;

import com.easyspring.beans.BeansException;

public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}
