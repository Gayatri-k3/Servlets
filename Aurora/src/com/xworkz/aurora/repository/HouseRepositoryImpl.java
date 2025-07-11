package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.HouseDTO;
import com.xworkz.aurora.dto.SecurityDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HouseRepositoryImpl implements HouseRepository {

    private final Set<HouseDTO> houses = new HashSet<>();

    public HouseRepositoryImpl(SecurityRepository securityRepository) {
        Iterator<SecurityDTO> iterator = securityRepository.findAll().iterator();

        houses.add(new HouseDTO("123 Green St", "Villa", 5, iterator.next()));
        houses.add(new HouseDTO("456 Lake Rd", "Apartment", 3, iterator.next()));
        houses.add(new HouseDTO("789 Hilltop Blvd", "Bungalow", 4, iterator.next()));
        houses.add(new HouseDTO("101 Rose Ave", "Duplex", 4, iterator.next()));
        houses.add(new HouseDTO("202 Maple Ln", "Cottage", 2, iterator.next()));
        houses.add(new HouseDTO("303 Palm Dr", "Villa", 6, iterator.next()));
        houses.add(new HouseDTO("404 Sunset Blvd", "Apartment", 3, iterator.next()));
        houses.add(new HouseDTO("505 Ocean View", "Bungalow", 4, iterator.next()));
        houses.add(new HouseDTO("606 Forest Way", "Duplex", 5, iterator.next()));
        houses.add(new HouseDTO("707 Garden Path", "Cottage", 2, iterator.next()));

        houses.add(new HouseDTO("808 Desert Dr", "Villa", 5, iterator.next()));
        houses.add(new HouseDTO("909 Sky Ln", "Apartment", 2, iterator.next()));
        houses.add(new HouseDTO("111 Cloud Rd", "Bungalow", 4, iterator.next()));
        houses.add(new HouseDTO("222 Windy Pass", "Duplex", 3, iterator.next()));
        houses.add(new HouseDTO("333 Sunny Ave", "Cottage", 2, iterator.next()));
        houses.add(new HouseDTO("444 Thunder St", "Villa", 5, iterator.next()));
        houses.add(new HouseDTO("555 Snowy Hill", "Apartment", 3, iterator.next()));
        houses.add(new HouseDTO("666 Rainy Rd", "Bungalow", 4, iterator.next()));
        houses.add(new HouseDTO("777 Misty Way", "Duplex", 3, iterator.next()));
        houses.add(new HouseDTO("888 Clear View", "Cottage", 2, iterator.next()));

        houses.add(new HouseDTO("999 Bright Ln", "Villa", 6, iterator.next()));
        houses.add(new HouseDTO("121 Golden St", "Apartment", 3, iterator.next()));
        houses.add(new HouseDTO("131 Silver Dr", "Bungalow", 4, iterator.next()));
        houses.add(new HouseDTO("141 Bronze Blvd", "Duplex", 5, iterator.next()));
        houses.add(new HouseDTO("151 Platinum Path", "Cottage", 2, iterator.next()));
        houses.add(new HouseDTO("161 Pearl Ave", "Villa", 5, iterator.next()));
        houses.add(new HouseDTO("171 Jade Rd", "Apartment", 3, iterator.next()));
        houses.add(new HouseDTO("181 Ruby Way", "Bungalow", 4, iterator.next()));
        houses.add(new HouseDTO("191 Emerald St", "Duplex", 5, iterator.next()));
        houses.add(new HouseDTO("201 Topaz Ln", "Cottage", 2, iterator.next()));
    }

    @Override
    public Set<HouseDTO> findAll() {
        return houses;
    }
}
