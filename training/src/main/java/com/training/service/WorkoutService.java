package com.training.service;

import java.util.List;

import com.training.bean.Workout;

public interface WorkoutService {

	void save(Workout workout);

	void update(Workout workout);

	List<Workout> getAll();

	Workout delete(Long id);

}
