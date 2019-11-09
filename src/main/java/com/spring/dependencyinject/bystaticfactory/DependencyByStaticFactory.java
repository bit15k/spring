package com.spring.dependencyinject.bystaticfactory;

public class DependencyByStaticFactory {
    public static HelloApi newInstance(String message,int index){
        return new HelloImpl(message,index);
    }
}
