package com.cdac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.entity.PgDac;

public class SpringTest {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.config.xml");
	
	
	PgDac dac = (PgDac)context.getBean("dac");
	dac.center();
	}

}
