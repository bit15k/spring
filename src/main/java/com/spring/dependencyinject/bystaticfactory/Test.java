package com.spring.dependencyinject.bystaticfactory;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testConstructor() {
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        //测试静态工厂注入
        //测试根据静态工厂+索引注入
        HelloApi byIndex =  context.getBean("byStaticFactoryAndbyIndex", HelloApi.class);
        byIndex.sayHello();
        //测试根据静态工厂+名称注入
        HelloApi ByName = context.getBean("byStaticFactoryAndbyName", HelloApi.class);
        ByName.sayHello();
        //根据静态工厂+类型注入
        HelloApi ByType = context.getBean("byStaticFactoryAndbyType", HelloApi.class);
        ByType.sayHello();


    }

}
