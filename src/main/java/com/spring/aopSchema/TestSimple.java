package com.spring.aopSchema;

import com.spring.aopSchema.service.IHelloWorldService;
import com.spring.aopSchema.service.IIntroductionService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSimple {
    @Test
    public void testHelloworld() {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("spring.xml");
        IHelloWorldService helloworldService =ctx.getBean("helloWorldService", IHelloWorldService.class);
        //helloworldService.sayHello();
        //前置带参数的通知测试
        //helloworldService.sayBefore("jiji");
        //后置返回通知测试
        //helloworldService.sayAfterReturning();
        //后置异常通知测试
        //helloworldService.sayAfterThrowing();
        //后置最终通知测试
        //helloworldService.sayAfter();
        //后置环绕通知测试
        //helloworldService.sayAround("haha");
    }

    /**
     * 测试引入一个新的接口
     */
    @Test
    public void testSchemaIntroduction() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        IIntroductionService introductionService =
                ctx.getBean("helloWorldService", IIntroductionService.class);
        introductionService.induct();
        System.out.println("======================================");
    }

    /**
     * 测试advisor
     */
    @Test
    public void testSchemaAdvisor() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        IHelloWorldService helloworldService =
                ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloworldService.sayAdvisorBefore("haha");
        System.out.println("======================================");
    }

}
