package com.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercise.bean.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
