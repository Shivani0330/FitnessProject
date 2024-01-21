package com.training.service;

import java.util.List;

import com.training.bean.Equipment;

public interface EquipmentService {

	void save(Equipment equipment);

	void update(Equipment equipment);

	List<Equipment> getAll();

	Equipment delete(Long id);

}
