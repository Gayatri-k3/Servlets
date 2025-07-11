package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.CountryDTO;
import com.xworkz.aurora.dto.PresidentDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountryRepositoryImpl implements CountryRepository {

    private final Set<CountryDTO> countries = new HashSet<>();

    public CountryRepositoryImpl(PresidentRepository presidentRepository) {
        Iterator<PresidentDTO> iterator = presidentRepository.findAll().iterator();

        countries.add(new CountryDTO("India", "New Delhi", 1400000000L, iterator.next()));
        countries.add(new CountryDTO("USA", "Washington, D.C.", 331000000L, iterator.next()));
        countries.add(new CountryDTO("Russia", "Moscow", 146000000L, iterator.next()));
        countries.add(new CountryDTO("China", "Beijing", 1440000000L, iterator.next()));
        countries.add(new CountryDTO("France", "Paris", 67000000L, iterator.next()));
        countries.add(new CountryDTO("Germany", "Berlin", 83000000L, iterator.next()));
        countries.add(new CountryDTO("Brazil", "Brasília", 212000000L, iterator.next()));
        countries.add(new CountryDTO("Australia", "Canberra", 25000000L, iterator.next()));
        countries.add(new CountryDTO("Canada", "Ottawa", 38000000L, iterator.next()));
        countries.add(new CountryDTO("UK", "London", 67000000L, iterator.next()));

        countries.add(new CountryDTO("Italy", "Rome", 60000000L, iterator.next()));
        countries.add(new CountryDTO("Japan", "Tokyo", 126000000L, iterator.next()));
        countries.add(new CountryDTO("South Korea", "Seoul", 52000000L, iterator.next()));
        countries.add(new CountryDTO("Mexico", "Mexico City", 128000000L, iterator.next()));
        countries.add(new CountryDTO("Indonesia", "Jakarta", 270000000L, iterator.next()));
        countries.add(new CountryDTO("Argentina", "Buenos Aires", 45000000L, iterator.next()));
        countries.add(new CountryDTO("Egypt", "Cairo", 104000000L, iterator.next()));
        countries.add(new CountryDTO("Spain", "Madrid", 47000000L, iterator.next()));
        countries.add(new CountryDTO("Netherlands", "Amsterdam", 17000000L, iterator.next()));
        countries.add(new CountryDTO("Turkey", "Ankara", 84000000L, iterator.next()));

        countries.add(new CountryDTO("Switzerland", "Bern", 8600000L, iterator.next()));
        countries.add(new CountryDTO("Sweden", "Stockholm", 10000000L, iterator.next()));
        countries.add(new CountryDTO("Norway", "Oslo", 5400000L, iterator.next()));
        countries.add(new CountryDTO("Finland", "Helsinki", 5500000L, iterator.next()));
        countries.add(new CountryDTO("Denmark", "Copenhagen", 5800000L, iterator.next()));
        countries.add(new CountryDTO("New Zealand", "Wellington", 5000000L, iterator.next()));
        countries.add(new CountryDTO("Singapore", "Singapore", 5700000L, iterator.next()));
        countries.add(new CountryDTO("Thailand", "Bangkok", 70000000L, iterator.next()));
        countries.add(new CountryDTO("South Africa", "Pretoria", 60000000L, iterator.next()));
        countries.add(new CountryDTO("UAE", "Abu Dhabi", 9800000L, iterator.next()));
    }

    @Override
    public Set<CountryDTO> findAll() {
        return countries;
    }
}
