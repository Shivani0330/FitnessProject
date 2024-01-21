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

import com.training.bean.Progress;
import com.training.service.ProgressService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/progress")
public class ProgressController {

	private static Logger log=LoggerFactory.getLogger(Progress.class.getSimpleName());
	
	@Autowired
	private ProgressService progressService;
	
	@PostMapping
	public ResponseEntity<Progress> save(@RequestBody Progress progress){
		progressService.save(progress);
		
		log.info("Progress saved {}",progress);
		
		ResponseEntity<Progress> responseEntity=new ResponseEntity<>(progress,HttpStatus.CREATED);
		return responseEntity;

	}
	
	@PutMapping
	public ResponseEntity<Progress> update(@RequestBody Progress progress){
		progressService.update(progress);
		
		log.info("Progress updated {}",progress);
		
		ResponseEntity<Progress> responseEntity=new ResponseEntity<>(progress,HttpStatus.OK);
		return responseEntity;

	}

	
	@GetMapping
	public ResponseEntity<List<Progress>> getAll(){
		List<Progress> progresses=progressService.getAll();
		log.info("List of progresses : {}",progresses);
		ResponseEntity<List<Progress>> responseEntities=new ResponseEntity<List<Progress>>(progresses,HttpStatus.OK);
		return responseEntities;
	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Progress> delete(@PathVariable Long id){
		Progress progress=progressService.delete(id);
		
		log.info("Progress deleted {}",id);
		
		ResponseEntity<Progress> responseEntity=new ResponseEntity<>(progress,HttpStatus.OK);
		return responseEntity;

	}

}
