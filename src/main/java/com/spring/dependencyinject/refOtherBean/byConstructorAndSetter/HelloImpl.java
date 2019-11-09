package com.spring.dependencyinject.refOtherBean.byConstructorAndSetter;

public class HelloImpl implements HelloApi {

    public void sayHello() {
        System.out.println("注入成功");
    }
}
