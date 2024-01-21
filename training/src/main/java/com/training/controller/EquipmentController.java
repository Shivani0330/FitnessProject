package com.training.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.bean.Equipment;
import com.training.service.EquipmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/equipment")
public class EquipmentController {

	private static Logger log=LoggerFactory.getLogger(Equipment.class.getSimpleName());
	
	@Autowired
	private EquipmentService equipmentService;
	
	@PostMapping
	public ResponseEntity<Equipment> save(@RequestBody Equipment equipment){
		equipmentService.save(equipment);
		
		log.info("Equipment saved {}",equipment);
		
		ResponseEntity<Equipment> responseEntity=new ResponseEntity<>(equipment,HttpStatus.CREATED);
		return responseEntity;

	}
	
	@PutMapping
	public ResponseEntity<Equipment> update(@RequestBody Equipment equipment){
		equipmentService.update(equipment);
		
		log.info("Equipment updated {}",equipment);
		
		ResponseEntity<Equipment> responseEntity=new ResponseEntity<>(equipment,HttpStatus.OK);
		return responseEntity;

	}

	
	@GetMapping
	public ResponseEntity<List<Equipment>> getAll(){
		List<Equipment> equipments=equipmentService.getAll();
		log.info("List of Equipments : {}",equipments);
		ResponseEntity<List<Equipment>> responseEntities=new ResponseEntity<List<Equipment>>(equipments,HttpStatus.OK);
		return responseEntities;
	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Equipment> delete(@PathVariable Long id){
		Equipment progress=equipmentService.delete(id);
		
		log.info("Equipment deleted {}",id);
		
		ResponseEntity<Equipment> responseEntity=new ResponseEntity<>(progress,HttpStatus.OK);
		return responseEntity;

	}

}
