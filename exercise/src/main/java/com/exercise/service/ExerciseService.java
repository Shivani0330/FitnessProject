package com.exercise.service;

import java.util.List;

import com.exercise.bean.Exercise;

public interface ExerciseService {

	void save(Exercise exercise);

	List<Exercise> getAll();

	Exercise delete(Long id);

	void update(Exercise exercise);

}
