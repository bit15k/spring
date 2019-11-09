package com.spring.dependencyinject.injectMap;

import com.spring.dependencyinject.injectlist.ListTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        MapTestBean mapTestBean = context.getBean("injectMap", MapTestBean.class);
        //3、执行业务逻辑
        System.out.println(mapTestBean.getValues().get("1"));
        mapTestBean.getValues().get("1");

    }
}
