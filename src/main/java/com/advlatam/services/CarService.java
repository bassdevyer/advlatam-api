package com.advlatam.services;

import java.util.List;

import com.advlatam.model.Car;

public interface CarService {
	
	 public  List<Car> findAll();
	 public Car saveCar(Car car);
	 public Car findByPlate(String plate);

}
