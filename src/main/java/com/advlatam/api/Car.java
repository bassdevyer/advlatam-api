package com.advlatam.api;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Car {

  private @Id @GeneratedValue Long id;
  private String plate;
  private String model;
  private String color;
  private String vin;
  private String additionalInfo;

  Car() {}

  Car(String plate, String color, String model, String vin, String additionalInfo) {
    this.plate = plate;
    this.color = color;
    this.model = model;
    this.vin = vin;
    this.additionalInfo = additionalInfo;
  }
}