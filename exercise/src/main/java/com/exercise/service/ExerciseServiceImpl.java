package com.exercise.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.bean.Exercise;
import com.exercise.repository.ExerciseRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired
	private ExerciseRepository exerciseRepository;
	
	@Override
	public void save(Exercise exercise) {
		exerciseRepository.save(exercise);
		System.out.println("Save success");
	}

	@Override
	public List<Exercise> getAll() {
		 return exerciseRepository.findAll();
	}

	@Override
	public Exercise delete(Long id) {
		Optional<Exercise> optional=exerciseRepository.findById(id);
		if(optional.isPresent()) {
			exerciseRepository.deleteById(id);
			System.out.println("Delete success");
			return optional.get();
		}else {
			optional.orElseThrow();
		}
		return null;
	}

	@Override
	public void update(Exercise exercise) {
		Optional<Exercise> optional=exerciseRepository.findById(exercise.getExerciseId());
		if(optional.isPresent()) {
			exerciseRepository.save(exercise);
			System.out.println("Update Success");
		}else {
			optional.orElseThrow();
		}
		
	}

}
