package com.spring.dependencyinject.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        HelloApi helloApi1 = context.getBean("bean5", HelloApi.class);
        helloApi1.sayHello();

    }
}
