package com.spring.aopAspectJ.Service;

public interface IHelloWorldService {
    //前置通知测试切入点
    public void sayBefore(String param);
    //后置返回通知测试切入点
    public boolean sayAfterReturning();
    //后置异常通知测试切入点
    public void sayAfterThrowing() throws Exception ;
    //最终通知测试切入点
    public void sayAfterFinally();
    //环绕通知测试切入点
    public void sayAround(String param);
}
