package com.iftm.ms.hr.worker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iftm.ms.hr.worker.entities.Worker;
import com.iftm.ms.hr.worker.repositories.WorkerRespository;

@Service
public class WorkerService {

	@Autowired
	private WorkerRespository repo;
	
	public List<Worker> findAll(){
		List<Worker> list = repo.findAll();
		return list;
		
	}
	
	public Worker findById(Long id) {
		Worker entity = repo.getOne(id);
		return entity;
	}

}
