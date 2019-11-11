package com.spring.aop.service;

public interface IHelloWorldService {
    //测试一般
    public void sayHello();
    //测试前置带参数的通知的目标方法
    public void sayBefore(String param);
    //测试后置返回通知的目标方法
    public boolean sayAfterReturning();
    //测试后置异常通知的目标方法
    public void sayAfterThrowing();
    //测试最终通知的目标方法
    public void sayAfter();
    //测试环绕通知的目标方法
    public void sayAround(String param);
    //
    public void sayAdvisorBefore(String param);


}
