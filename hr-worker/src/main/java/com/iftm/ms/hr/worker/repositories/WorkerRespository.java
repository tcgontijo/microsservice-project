package com.iftm.ms.hr.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.ms.hr.worker.entities.Worker;

public interface WorkerRespository extends JpaRepository<Worker, Long> {

}
