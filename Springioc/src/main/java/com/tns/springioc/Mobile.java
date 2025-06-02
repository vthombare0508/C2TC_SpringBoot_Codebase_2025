package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext c =new ClassPathXmlApplicationContext("beans.xml");  //loose coupling
		
		System.out.println("configuration file loaded...!");
		
		//Airtel a =(Airtel) c.getBean("airtel");  //type casting
		//Jio j=c.getBean("jio",Jio.class);
		
		sim s=c.getBean("sim",sim.class);
		
		s.calling();
		s.data();
		
       
	}

}
