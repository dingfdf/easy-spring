package com.easyspring.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author Ding Fan
 * @version V1.0.0
 * @date 2022/12/4
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Inherited
public @interface Qualifier {

    String value() default "";
}
