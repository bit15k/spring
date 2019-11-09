package com.spring.dependencyinject.injectArray;

import com.spring.dependencyinject.injectbeanid.IdRefTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        ArrayTestBean arrayTestBean = context.getBean("injectArray", ArrayTestBean.class);
        //3、执行业务逻辑
        for (String a : arrayTestBean.getArray()){
            System.out.print("一维数组"+a+" ");
        }
        for (String[] a : arrayTestBean.getArray2()){
            for (String b : a){
                System.out.print("二维数组"+b+" ");
            }
        }


    }
}
