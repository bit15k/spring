package com.spring.dependencyinject.byconstructor;

public class ByIndex implements HelloApi {
    private String message;
    private int index;
    public ByIndex(String message,int index){
        this.message = message;
        this.index = index;
    }
    public void sayHello() {
        System.out.println("这是构造器注入,根据索引注入"+index + ":" + message);
    }

}
