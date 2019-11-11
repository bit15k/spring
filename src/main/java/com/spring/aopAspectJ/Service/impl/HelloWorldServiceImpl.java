package com.spring.aopAspectJ.Service.impl;

import com.spring.aopAspectJ.Service.IHelloWorldService;
import org.aspectj.lang.annotation.Pointcut;

public class HelloWorldServiceImpl implements IHelloWorldService {
    public void sayBefore(String param){
        System.out.println("目标方法执行...带参数："+param);
    }
    public boolean sayAfterReturning(){
        System.out.println("目标方法执行...带返回值：");
        return true;
    }

    public void sayAfterThrowing() throws Exception {
        System.out.println("目标方法执行...异常值：");
        throw  new Exception();
    }
    public void sayAfterFinally(){
        System.out.println("目标方法执行...：");
    }
    public void sayAround(String param){
        System.out.println("目标方法执行...,并替换参数："+param);
    }

}
