package com.advlatam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class Car {

  private @Id @GeneratedValue Long id;
  private String plate;
  private String model;
  private String color;
  private String vin;
  private String additionalInfo;
  @Transient boolean canCirculate;

  public Car() {}

  public Car(String plate, String color, String model, String vin, String additionalInfo) {
    this.plate = plate;
    this.color = color;
    this.model = model;
    this.vin = vin;
    this.additionalInfo = additionalInfo;
  }
}