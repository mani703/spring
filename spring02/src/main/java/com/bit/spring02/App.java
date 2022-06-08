package com.bit.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.spring02.service.MyModule;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = null;
		ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		MyModule module = ac.getBean(MyModule.class);
		
		module.func01();
//		module.func02(1234);
//		System.out.println(module.func03());
		
//		module.func04();
	}

}
