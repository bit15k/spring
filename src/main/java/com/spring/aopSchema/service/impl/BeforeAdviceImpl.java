package com.spring.aopSchema.service.impl;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * advisor的前置通知配置
 */
public class BeforeAdviceImpl implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("===========before advice");
    }
}
