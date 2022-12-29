package com.easyspring.beans.factory.support;

import com.easyspring.beans.BeansException;
import com.easyspring.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition 注册表
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 根据 Bean 名称查找 BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 是否包含指定 Bean 名称的 BeanDefinition
     *
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 返回所有的 Bean 名称
     *
     * @return
     */
    String[] getBeanDefinitionNames();
}
