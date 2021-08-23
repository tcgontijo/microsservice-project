package com.iftm.ms.hr.worker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.ms.hr.worker.entities.Worker;
import com.iftm.ms.hr.worker.service.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {
	
	@Autowired
	private WorkerService service;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = service.findAll(); 
		return ResponseEntity.ok(list);
	}

}
