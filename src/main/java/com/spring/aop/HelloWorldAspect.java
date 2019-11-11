package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class HelloWorldAspect {
    //前置通知不带参数
    public void beforeAdvice() {
        System.out.println("前置通知运行中...");
    }
    //前置通知带参数
    public void beforeAdvice(String param) {
        System.out.println("前置通知执行中，并收到了来自目标方法的参数：" + param);
    }
    //后置返回通知
    public void afterReturningAdvice(Object retVal) {
        System.out.println("后置返回通知执行中...，并收到目标方法的返回值：" + retVal);
    }
    //后置异常通知
    public void afterThrowingAdvice(Exception exception) {
        System.out.println("后置异常通知执行中...并收到目标方法抛出的异常：" + exception);
    }
    //后置最终通知
    public void afterFinallyAdvice() {
        System.out.println("后置最终通知执行中...");
    }
    //环绕通知
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("===========around before advice");
        Object retVal = pjp.proceed(new Object[] {"replace"});
        System.out.println("===========around after advice");
        return retVal;
    }
}
