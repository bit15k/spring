package com.spring.dependencyinject.bystaticfactory;

public class HelloImpl implements HelloApi {
    private String message;
    private int index;
    public HelloImpl(String message,int index){
        this.message = message;
        this.index = index;
    }
    public void sayHello() {
        System.out.println("测试静态工厂注入"+"参数1:"+message+",参数2："+index);
    }
}
