package com.advlatam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.advlatam.model.Car;


public interface CarRepository extends JpaRepository<Car, Long> {
	
	@Query("SELECT c FROM Car c WHERE c.plate = ?1")
	public Car findByPlate(String plate);

}