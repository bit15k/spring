package com.spring.aopAspectJ.aspect;

import com.spring.aopAspectJ.Service.IIntroductionService;
import com.spring.aopAspectJ.Service.impl.IntroductiondService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
//基于注解ASpect的切入面类，所有的通知全部以注解形式配置
@Aspect
public class HelloWorldAspect2 {
    //定义切入点
//    @Pointcut(value="execution(* com.spring.aopAspectJ.HelloService.sayBefore(..)) && args(param)", argNames = "param")
//    public void beforePointcut(String param) {}
    //定义前置通知
    //value：有两种写法，一种是直接写切入点表达式，另一种则是去掉上面注释写声明的切入点方法；
    //同样其他通知类型也有此写法
    @Before(value = "execution(* com.spring.aopAspectJ.Service.impl.HelloWorldServiceImpl.sayBefore(..)) && args(param)", argNames = "param")
    public void beforeAdvice(String param) {
        System.out.println("前置通知执行，参数为：" + param);
    }

    //后置返回通知
    @AfterReturning(value = "execution(* com.spring.aopAspectJ.Service.impl.HelloWorldServiceImpl.sayAfterReturning(..))", argNames = "retVal", returning = "retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("后置返回通知，返回值为" + retVal);
    }

    //后置异常通知
    @AfterThrowing(value ="execution(* com.spring.aopAspectJ.Service.impl.HelloWorldServiceImpl.sayAfterThrowing(..))",argNames = "exception",throwing = "exception")
    public void afterThrowingAdvice(Exception exception) {
        System.out.println("后置异常通知，异常值：" + exception);
    }
    //后置最终通知
    @After(value="execution(* com.spring.aopAspectJ.Service.impl.HelloWorldServiceImpl.sayAfterFinally(..))")
    public void afterFinallyAdvice() {
        System.out.println("最终通知");
    }
    //环绕通知
    @Around(value="execution(* com.spring.aopAspectJ.Service.impl.HelloWorldServiceImpl.sayAround(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("===========around before advice");
        Object retVal = pjp.proceed(new Object[] {"replace"});
        System.out.println("===========around after advice");
        return retVal;
    }
    //引入
    @DeclareParents(value = "com.spring.aopAspectJ.Service.impl.HelloWorldServiceImpl+",defaultImpl = IntroductiondService.class)
    private IIntroductionService iIntroductionService;

}
