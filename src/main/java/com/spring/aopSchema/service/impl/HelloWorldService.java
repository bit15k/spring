package com.spring.aopSchema.service.impl;
import com.spring.aopSchema.service.*;

public class HelloWorldService implements IHelloWorldService {
    public void sayHello() {
        System.out.println("============Hello World!");
    }

    public void sayBefore(String param) {

        System.out.println("目标方法执行中...参数是： " + param);
    }

    public boolean sayAfterReturning() {
        System.out.println("目标方法执行中...,并返回值");
        return true;
    }

    public void sayAfterThrowing() {
        System.out.println("目标方法执行...抛出异常了...");
        throw new RuntimeException();
    }

    public void sayAfter() {
        System.out.println("目标方法执行...");
    }

    public void sayAround(String param) {
        System.out.println("目标方法执行...，参数为：" + param);
    }

    public void sayAdvisorBefore(String param) {
        System.out.println("============say " + param);
    }


}
