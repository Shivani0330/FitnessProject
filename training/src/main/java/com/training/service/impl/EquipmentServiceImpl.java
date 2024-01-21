package com.training.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Equipment;
import com.training.repository.EquipmentRepository;
import com.training.service.EquipmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	private EquipmentRepository equipmentRepository;
	
	@Override
	public void save(Equipment workout) {
		equipmentRepository.save(workout);
		System.out.println("Save success");
	}

	@Override
	public List<Equipment> getAll() {
		 return equipmentRepository.findAll();
	}

	@Override
	public Equipment delete(Long id) {
		Optional<Equipment> optional=equipmentRepository.findById(id);
		if(optional.isPresent()) {
			equipmentRepository.deleteById(id);
			System.out.println("Delete success");
			return optional.get();
		}else {
			optional.orElseThrow();
		}
		return null;
	}

	@Override
	public void update(Equipment workout) {
		Optional<Equipment> optional=equipmentRepository.findById(workout.getEquipmentId());
		if(optional.isPresent()) {
			equipmentRepository.save(workout);
			System.out.println("Update Success");
		}else {
			optional.orElseThrow();
		}
		
	}

}
