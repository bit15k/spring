package com.spring.dependencyinject.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testConstructor() {
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("helloworld.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        //测试构造器注入
        //测试根据索引注入
        HelloApi byIndex = context.getBean("byIndex", ByIndex.class);
        byIndex.sayHello();
        //测试根据名称注入
        HelloApi ByName = context.getBean("byName", ByName.class);
        ByName.sayHello();
        //根据类型注入
        HelloApi ByType = context.getBean("byType", ByType.class);
        ByType.sayHello();


    }

}
