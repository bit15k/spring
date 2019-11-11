package com.spring.aopAspectJ;

import com.spring.aopAspectJ.Service.impl.HelloWorldServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testAnnotationBeforeAdvice() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        HelloWorldServiceImpl helloWorldServiceImpl = ctx.getBean("helloService", HelloWorldServiceImpl.class);
        helloWorldServiceImpl.sayBefore("before");
        System.out.println("======================================");
    }
    @org.junit.Test
    public void testAnnotationAfterReturningAdvice() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        HelloWorldServiceImpl helloWorldServiceImpl = ctx.getBean("helloService", HelloWorldServiceImpl.class);
        helloWorldServiceImpl.sayAfterReturning();
        System.out.println("======================================");
    }
    @org.junit.Test
    public void testAnnotationAfterThrowingAdvice() throws Exception {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        HelloWorldServiceImpl helloWorldServiceImpl = ctx.getBean("helloService", HelloWorldServiceImpl.class);
        helloWorldServiceImpl.sayAfterThrowing();
        System.out.println("======================================");
    }
    @org.junit.Test
    public void testAnnotationAfterFinallyAdvice() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        HelloWorldServiceImpl helloWorldServiceImpl = ctx.getBean("helloService", HelloWorldServiceImpl.class);
        helloWorldServiceImpl.sayAfterFinally();
        System.out.println("======================================");
    }
    @org.junit.Test
    public void testAnnotationAroundAdvice() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        HelloWorldServiceImpl helloWorldServiceImpl = ctx.getBean("helloService", HelloWorldServiceImpl.class);
        helloWorldServiceImpl.sayAround("nihao");
        System.out.println("======================================");
    }
}
