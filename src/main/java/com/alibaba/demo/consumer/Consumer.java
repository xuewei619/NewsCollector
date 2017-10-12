package com.alibaba.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.demo.DemoService;

public class Consumer {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:dubbo-demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // obtain proxy object for remote invocation
        String hello = demoService.sayHello(); // execute remote invocation
        System.out.println(hello); // show the result
    }
}
