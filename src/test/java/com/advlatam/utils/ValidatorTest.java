package com.advlatam.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class ValidatorTest {

	@Test
	void test() {
		boolean actual=false;
		Validator validator= new Validator();
		actual=validator.validateRestriction("PLN525",LocalDateTime.now());
		
		assertEquals(true, actual); 
	}

}
