package com.cdac.entity_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PgDac implements Course {

	@Autowired
	private TrainingCenter center;

	public PgDac() {
		System.out.println("Met nashik");
	}

	public PgDac(TrainingCenter center) {
		super();
		this.center = center;
	}

	public TrainingCenter getCenter() {
		return center;
	}

	public void setCenter(TrainingCenter center) {
		this.center = center;
	}

	@Override
	public void center() {
		System.out.println("Current course is Pg-dac");
		center.conductTraining();
	}

}
