package com.advlatam.api;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CarController {

  private final CarRepository repository;

  CarController(CarRepository repository) {
    this.repository = repository;
  }

  // Aggregate root

  @CrossOrigin(origins = "*")
  @GetMapping("/cars")
  List<Car> all() {
    return repository.findAll();
  }

  @PostMapping("/cars")
  Car newCar(@RequestBody Car newCar) {
    return repository.save(newCar);
  }

    // Single item

    @GetMapping("/restriction/{plate}/{dateTime}")
    Boolean getRestrictionStatus(@PathVariable String plate, @PathVariable LocalDateTime dateTime ) {
        return false;
    }

  
}