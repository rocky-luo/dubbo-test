package com.rocky.dubbo.test.demo.consumer;

import com.rocky.demo.test.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rocky on 17/12/15.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:application-context.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // obtain proxy object for remote invocation
        while (true) {
            try {
                Thread.sleep(1000L);
                String hello = demoService.sayHello("world"); // execute remote invocation
                System.out.println(hello); // show the result
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
