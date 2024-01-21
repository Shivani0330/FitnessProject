package com.training.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Progress;
import com.training.repository.ProgressRepository;
import com.training.service.ProgressService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProgressServiceImpl implements ProgressService {

	@Autowired
	private ProgressRepository progressRepository;
	
	@Override
	public void save(Progress workout) {
		progressRepository.save(workout);
		System.out.println("Save success");
	}

	@Override
	public List<Progress> getAll() {
		 return progressRepository.findAll();
	}

	@Override
	public Progress delete(Long id) {
		Optional<Progress> optional=progressRepository.findById(id);
		if(optional.isPresent()) {
			progressRepository.deleteById(id);
			System.out.println("Delete success");
			return optional.get();
		}else {
			optional.orElseThrow();
		}
		return null;
	}

	@Override
	public void update(Progress workout) {
		Optional<Progress> optional=progressRepository.findById(workout.getProgressId());
		if(optional.isPresent()) {
			progressRepository.save(workout);
			System.out.println("Update Success");
		}else {
			optional.orElseThrow();
		}
		
	}

}
