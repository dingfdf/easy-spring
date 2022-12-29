package com.easyspring.beans;

/**
 * @author Ding Fan
 * @version V1.0.0
 * @date 2022/12/4
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
