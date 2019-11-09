package com.spring.dependencyinject.byconstructor;

public class ByType implements HelloApi {
    private String message;
    private int index;
    public ByType(String message,int index){
        this.message = message;
        this.index = index;
    }
    public void sayHello() {
        System.out.println("这是构造器注入,根据类型注入"+index + ":" + message);
    }
}
