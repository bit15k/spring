import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    @Test
    public void testHelloWorld() {
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        HelloAPI helloApi = context.getBean("hello", HelloAPI.class);
        //3、执行业务逻辑
        helloApi.sayHello();
        //单独用name做标识符
        HelloAPI helloAPI = context.getBean("test3",Test3.class);
        helloAPI.sayHello();
        //同时使用id和name
        HelloAPI helloAPI4 = context.getBean("test4",Test4.class);
        helloAPI4.sayHello();

    }


    }
