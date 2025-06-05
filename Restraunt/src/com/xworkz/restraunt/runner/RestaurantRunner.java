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
            restaurantDto.setName("1");
            restaurantDto.setLocation(null);
            restaurantDto.setEmail(null);
            restaurantDto.setContactDetails(null);
            restaurantDto.setRating("2.5");
            restaurantDto.setFoodMenu(new String[]{});
            restaurantDto.setType(null);
            restaurantDto.setOpeningTime(LocalTime.of(8, 30));
            restaurantDto.setClosingTime(LocalTime.of(13, 0));
            restaurantDto.setBookedDate(LocalDate.now().minusDays(1));
            restaurantDto.setBookedTime(LocalTime.of(8, 0));
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
