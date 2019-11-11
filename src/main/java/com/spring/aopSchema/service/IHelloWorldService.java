package com.spring.aopSchema.service;

/**
 * 各种业务逻辑的接口，此处每个方法用于测试各种通知而写的
 */
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
    //测试Advisor
    public void sayAdvisorBefore(String param);


}
