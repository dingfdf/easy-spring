package com.easyspring.beans.factory.config;

import com.easyspring.beans.factory.HierarchicalBeanFactory;
import com.easyspring.beans.util.StringValueResolver;
import com.easyspring.core.convert.ConversionService;

public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void destroySingletons();

    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    String resolveEmbeddedValue(String value);

    void setConversionService(ConversionService conversionService);

    ConversionService getConversionService();
}
