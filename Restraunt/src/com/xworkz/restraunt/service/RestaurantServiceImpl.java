package com.xworkz.restraunt.service;

import com.xworkz.restraunt.dto.RestaurantDto;
import com.xworkz.restraunt.exception.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public boolean validate(RestaurantDto restaurantDto) {
        boolean isValid = true;

        try {
            String name = restaurantDto.getName();
            if (name == null) {
                throw new NullPointerException("Name is null");
            } else if (name.length() < 3) {
                throw new NameTooShortException("Name must be at least 3 characters long");
            } else if (name.length() > 25) {
                throw new NameTooLongException("Name must not exceed 25 characters");
            } else if (Character.isDigit(name.charAt(0))) {
                throw new NameStartsWithDigitException("Name must not start with a number");
            } else {
                System.out.println("Name is valid");
            }
        } catch (Exception e) {
            System.err.println("Name validation failed: " + e.getMessage());
            isValid = false;
        }

        try {
            String rating = restaurantDto.getRating();
            if (rating == null) {
                throw new NullPointerException("Rating is null");
            } else if (Double.parseDouble(rating) < 3) {
                throw new LowRatingException("Rating must be at least 3");
            } else {
                System.out.println("Rating is valid");
            }
        } catch (Exception e) {
            System.err.println("Rating validation failed: " + e.getMessage());
            isValid = false;
        }

        try {
            String[] foodMenu = restaurantDto.getFoodMenu();
            if (foodMenu == null) {
                throw new NullPointerException("Food menu is null");
            }
            String test = foodMenu[0]; // Will throw ArrayIndexOutOfBoundsException if empty
            System.out.println("Food menu is valid");
        } catch (Exception e) {
            System.err.println("Food menu validation failed: " + e.getMessage());
            isValid = false;
        }

        try{
            LocalTime openingTime = restaurantDto.getOpeningTime();
            if (openingTime == null) {
                throw new NullPointerException("Opening time is null");
            } else if (openingTime.isBefore(LocalTime.of(9, 0))) {
                throw new EarlyOpeningTimeException("Opening time must be after 9:00 AM");
            } else {
                System.out.println("Opening time is valid");
            }
        } catch (Exception e) {
            System.err.println("Opening time validation failed: " + e.getMessage());
            isValid = false;
        }

        try {
            LocalTime closingTime = restaurantDto.getClosingTime();
            if (closingTime == null) {
                throw new NullPointerException("Closing time is null");
            } else if (closingTime.isAfter(LocalTime.of(12, 0))) {
                throw new LateClosingTimeException("Closing time must be before 12:00 PM");
            } else {
                System.out.println("Closing time is valid");
            }
        } catch (Exception e) {
            System.err.println("Closing time validation failed: " + e.getMessage());
            isValid = false;
        }

        try {
            LocalDate bookedDate = restaurantDto.getBookedDate();
            if (bookedDate == null) {
                throw new NullPointerException("Booked date is null");
            } else if (bookedDate.isBefore(LocalDate.now())) {
                throw new InvalidBookingDateException("Booking date must not be in the past");
            } else {
                System.out.println("Booked date is valid");
            }
        } catch (Exception e) {
            System.err.println("Booked date validation failed: " + e.getMessage());
            isValid = false;
        }

        try {
            LocalTime bookedTime = restaurantDto.getBookedTime();
            if (bookedTime == null) {
                throw new NullPointerException("Booked time is null");
            } else if (bookedTime.isBefore(LocalTime.of(9, 0)) || bookedTime.isAfter(LocalTime.of(12, 0))) {
                throw new InvalidBookingTimeException("Booking time must be between 9:00 AM and 12:00 PM");
            } else {
                System.out.println("Booked time is valid");
            }
        } catch (Exception e) {
            System.err.println("Booked time validation failed: " + e.getMessage());
            isValid = false;
        }
        return isValid;
    }
}
