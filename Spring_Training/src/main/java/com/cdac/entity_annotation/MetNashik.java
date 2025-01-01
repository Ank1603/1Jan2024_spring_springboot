package com.cdac.entity_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetNashik implements TrainingCenter {

	@Autowired
	private Trainer javaTrainer;

	public MetNashik() {
		System.out.println("Java Trainer");
	}

	public MetNashik(Trainer javaTrainer) {
		super();
		this.javaTrainer = javaTrainer;
	}

	public Trainer getJavaTrainer() {
		return javaTrainer;
	}

	public void setJavaTrainer(Trainer javaTrainer) {
		this.javaTrainer = javaTrainer;
	}

	@Override
	public void conductTraining() {
		System.out.println("Met Nashik is responsible to conduct training");
		javaTrainer.train();
	}

}
