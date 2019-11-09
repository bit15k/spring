package com.spring.dependencyinject.bysetter;

public class BySetter implements HelloApi {


    public void setMessage(String message) {
        this.message = message;
    }



    public void setIndex(int index) {
        this.index = index;
    }

    private String message;
    private int index;
    public void sayHello() {
        System.out.println(index+message);
    }
}
