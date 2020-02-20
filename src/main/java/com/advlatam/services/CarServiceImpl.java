package com.advlatam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advlatam.exceptions.CarNotFoundException;
import com.advlatam.model.Car;
import com.advlatam.repositories.CarRepository;

@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	private CarRepository repository;

	@Override
	public List<Car> findAll() {
		return repository.findAll();
	}

	@Override
	public Car saveCar(Car car) {
		return repository.save(car);
	}

	@Override
	public Car findByPlate(String plate) throws CarNotFoundException{
		Car car= repository.findByPlate(plate);
		if(car==null) {
			throw new CarNotFoundException(plate);
		}
		return car;
 	}

}
