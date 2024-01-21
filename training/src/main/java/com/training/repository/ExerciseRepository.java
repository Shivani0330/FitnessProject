package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.bean.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
