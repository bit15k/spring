package com.spring.dependencyinject.injectbeanid;

public class IdRefTestBean {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void sayHello(){
        System.out.println("注入ID："+this.id);
    }
}
