package com.advlatam.exceptions;

public class CarNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8935349179213521585L;

	public CarNotFoundException(String plate) {
    super("No se pudo encontrar ningun auto con placa " + plate);
  }
}