package com.moning.cosumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morning.demo.DemoService;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	            new String[]{"/META-INF/spring/dubbo-demo-consumer.xml"});
	    context.start();
	    // obtain proxy object for remote invocation
	    DemoService demoService = (DemoService) context.getBean("demoService");
	    // execute remote invocation
	    String hello = demoService.sayHello(" world");
	    // show the result
	    System.out.println(hello);
	}
	
}
