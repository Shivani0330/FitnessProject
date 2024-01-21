package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.bean.Progress;

public interface ProgressRepository extends JpaRepository<Progress, Long>{

}
