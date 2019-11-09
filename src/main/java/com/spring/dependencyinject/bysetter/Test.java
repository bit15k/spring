package com.spring.dependencyinject.bysetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testBySetter(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
    HelloApi helloApi = context.getBean("bySetter",BySetter.class);
    helloApi.sayHello();
    }
}
