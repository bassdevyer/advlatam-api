package com.advlatam.utils;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Validator {

	public static final LocalTime initRestriction = LocalTime.of(5, 0);
	public static final LocalTime endRestriction = LocalTime.of(20, 30);
	

		public boolean validateRestriction(String plate, LocalDateTime localDateTime) throws NumberFormatException {
		boolean circula = false;
		int numberOfPlate = Integer.valueOf(plate.substring(plate.length() - 1));
		int dayOfWeek = localDateTime.toLocalDate().getDayOfWeek().getValue();
		if (dayOfWeek <= 5) {
			if (!validatePlateAndDay(numberOfPlate, dayOfWeek)) {
				circula = validateDateTime(localDateTime.toLocalTime());
			} else {
				circula = true;
			}
		} else {
			circula = true;
		}

		return circula;
	}

	private boolean validateDateTime(LocalTime time) {
		if (time.isBefore(initRestriction) || time.isAfter(endRestriction)) {
			return true;
		}
		return false;
	}

	private boolean validatePlateAndDay(int numberPlate, int day) {
		if (day == 1 && (numberPlate == 1 || numberPlate == 2)) {
			return false;
		} else if (day == 2 && (numberPlate == 3 || numberPlate == 4)) {
			return false;
		} else if (day == 3 && (numberPlate == 5 || numberPlate == 6)) {
			return false;
		} else if (day == 4 && (numberPlate == 7 || numberPlate == 8)) {
			return false;
		} else if (day == 5 && (numberPlate == 9 || numberPlate == 0)) {
			return false;
		}

		return true;

	}

}
