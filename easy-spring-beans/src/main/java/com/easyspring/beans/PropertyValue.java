package com.easyspring.beans;

/**
 * property of the bean
 *
 * @author Ding Fan
 * @version V1.0.0
 * @date 2022/12/27
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
