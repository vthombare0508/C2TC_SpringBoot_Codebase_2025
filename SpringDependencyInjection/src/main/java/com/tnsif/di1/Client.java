package com.tnsif.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext c =new ClassPathXmlApplicationContext("beans.xml");  //loose coupling
        Student s1=c.getBean("s1",Student.class);
		s1.numericals();
		
		Student1 s2=c.getBean("s2",Student1.class);
		s2.startMath();
		
	}

}
