package com.xworkz.restraunt.runner;

import com.xworkz.restraunt.dto.RestaurantDto;
import com.xworkz.restraunt.service.RestaurantService;
import com.xworkz.restraunt.service.RestaurantServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantRunner {
    public static void main(String[] args) {
        RestaurantDto restaurantDto = new RestaurantDto();

        try {
            restaurantDto.setName("SpiceVilla");
            restaurantDto.setLocation("Hubballi");
            restaurantDto.setEmail("contact@spicevilla.in");
            restaurantDto.setContactDetails("9348263745");
            restaurantDto.setRating("4.2");
            restaurantDto.setFoodMenu(new String[]{"Paneer Tikka", "Veg Biryani"});
            restaurantDto.setType("Veg & Non-Veg");
            restaurantDto.setOpeningTime(LocalTime.of(9, 15));
            restaurantDto.setClosingTime(LocalTime.of(11, 45));
            restaurantDto.setBookedDate(LocalDate.now().plusDays(2));
            restaurantDto.setBookedTime(LocalTime.of(10, 30));
        } catch (Exception e) {
            System.err.println("Error setting DTO values: " + e.getMessage());
        }

        RestaurantService service = new RestaurantServiceImpl();
        boolean result = service.validate(restaurantDto);

        if (result) {
            System.out.println("Restaurant Details are correct");
        } else {
            System.out.println("Restaurant Details are not correct");
        }
    }
}
