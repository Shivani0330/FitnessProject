package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.bean.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Long>{

}
