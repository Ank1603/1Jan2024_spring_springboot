package com.cdac.entity;

import java.util.List;

public class JavaTrainer implements Trainer {

	private String name;
	private List<String> topics;

	public JavaTrainer() {
		System.out.println("Instantiation of Pg-dac");
	}

	public JavaTrainer(String name, List<String> topics) {
		super();
		this.name = name;
		this.topics = topics;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public void train() {
		System.out.println(name + " is teaching" + topics + "of java module.");
	}
}
