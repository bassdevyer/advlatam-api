package com.advlatam.restController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.advlatam.model.Car;
import com.advlatam.services.CarServiceImpl;
import com.advlatam.utils.Validator;

@RestController
public class CarController {


	@Autowired
	private Validator validator;
	
	@Autowired
	private CarServiceImpl service;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/cars")
	public List<Car> all() {
		return service.findAll();
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/cars")
	public Car newCar(@RequestBody Car newCar) {
		return service.saveCar(newCar);
	}

	@GetMapping("/restriction/{plate}/{dateTime}")
   public Car getRestrictionStatus(@PathVariable String plate, @PathVariable String dateTime ) {
		LocalDateTime localDateTime=LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
		Car car = service.findByPlate(plate);
        return validator.validateRestriction(car,localDateTime);
    }

	@GetMapping("/getCar/{plate}")
    public Car getCar(@PathVariable String plate) {
      return service.findByPlate(plate);
    }

  
}