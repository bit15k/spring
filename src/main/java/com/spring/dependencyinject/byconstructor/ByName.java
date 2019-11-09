package com.spring.dependencyinject.byconstructor;

public class ByName implements HelloApi {
    private String message;
    private int index;
    public ByName(String message,int index){
        this.message = message;
        this.index = index;
    }
    public void sayHello() {
        System.out.println("这是构造器注入,根据名称注入"+index + ":" + message);
    }
}
