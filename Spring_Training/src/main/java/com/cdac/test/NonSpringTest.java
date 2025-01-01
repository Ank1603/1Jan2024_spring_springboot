package com.cdac.test;

import java.util.Arrays;
import java.util.List;

import com.cdac.entity.Course;
import com.cdac.entity.JavaTrainer;
import com.cdac.entity.MetNashik;
import com.cdac.entity.PgDac;
import com.cdac.entity.Trainer;
import com.cdac.entity.TrainingCenter;

public class NonSpringTest {
	public static void main(String[] args) {

		List<String> topics = Arrays.asList("OOP,Collection,Exception");

		Trainer javaTrainer = new JavaTrainer("Mr.Vishal", topics);

		TrainingCenter metNashik = new MetNashik(javaTrainer);

		Course pgDac = new PgDac();

		((PgDac) pgDac).setCenter(metNashik);

		pgDac.center();

	}
}
