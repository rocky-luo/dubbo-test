package com.rocky.dubbo.test.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rocky on 17/12/15.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:application-context.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
