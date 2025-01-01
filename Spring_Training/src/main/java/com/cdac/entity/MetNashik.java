package com.cdac.entity;

public class MetNashik implements TrainingCenter {

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
