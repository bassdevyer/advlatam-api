package com.advlatam.api;

class CarNotFoundException extends RuntimeException {

    CarNotFoundException(String plate) {
    super("No se pudo encontrar ningun auto con placa " + plate);
  }
}