package com.cdac.entity_annotation;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationSpringTest {

	public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	
	
	JavaTrainer javaTrainer = context.getBean(JavaTrainer.class);
	javaTrainer.setName("Mr Rahul");
	javaTrainer.setTopics(Arrays.asList("OOP","Threads","Exception"));
	
	PgDac dac = context.getBean(PgDac.class);
	dac.center();
	}

}
