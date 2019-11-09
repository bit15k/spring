package com.spring.dependencyinject.innerBean;

public class HelloImpl implements HelloApi {

    public void sayHello() {
        System.out.println("注入成功");
    }
}
