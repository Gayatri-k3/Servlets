package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.DriverDTO;
import com.xworkz.aurora.dto.PresidentDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PresidentRepositoryImpl implements PresidentRepository {

    private final Set<PresidentDTO> presidents = new HashSet<>();

    public PresidentRepositoryImpl(DriverRepository driverRepository) {
        Iterator<DriverDTO> iterator = driverRepository.findAll().iterator();

        presidents.add(new PresidentDTO("Ram Nath Kovind", "BJP", 5, iterator.next()));
        presidents.add(new PresidentDTO("Droupadi Murmu", "BJP", 6, iterator.next()));
        presidents.add(new PresidentDTO("Pranab Mukherjee", "INC", 5, iterator.next()));
        presidents.add(new PresidentDTO("A. P. J. Abdul Kalam", "Independent", 5, iterator.next()));
        presidents.add(new PresidentDTO("K. R. Narayanan", "Independent", 5, iterator.next()));
        presidents.add(new PresidentDTO("Shankar Dayal Sharma", "INC", 5, iterator.next()));
        presidents.add(new PresidentDTO("R. Venkataraman", "INC", 5, iterator.next()));
        presidents.add(new PresidentDTO("Zail Singh", "INC", 5, iterator.next()));
        presidents.add(new PresidentDTO("Neelam Sanjiva Reddy", "Janata Party", 5, iterator.next()));
        presidents.add(new PresidentDTO("Fakhruddin Ali Ahmed", "INC", 3, iterator.next()));

        presidents.add(new PresidentDTO("V. V. Giri", "Independent", 4, iterator.next()));
        presidents.add(new PresidentDTO("Varahagiri Venkata Giri", "Independent", 1, iterator.next()));
        presidents.add(new PresidentDTO("Sarvepalli Radhakrishnan", "Independent", 5, iterator.next()));
        presidents.add(new PresidentDTO("Rajendra Prasad", "Independent", 12, iterator.next()));
        presidents.add(new PresidentDTO("John Doe", "Green Party", 2, iterator.next()));
        presidents.add(new PresidentDTO("Jane Smith", "Liberal Party", 3, iterator.next()));
        presidents.add(new PresidentDTO("Carlos Mendes", "Socialist Party", 6, iterator.next()));
        presidents.add(new PresidentDTO("Elena Garcia", "Democratic Party", 4, iterator.next()));
        presidents.add(new PresidentDTO("Michael Brown", "Republican Party", 5, iterator.next()));
        presidents.add(new PresidentDTO("Amelia Jones", "Progressive Party", 3, iterator.next()));

        presidents.add(new PresidentDTO("Samuel Carter", "Centrist Party", 2, iterator.next()));
        presidents.add(new PresidentDTO("Laura White", "Unity Party", 4, iterator.next()));
        presidents.add(new PresidentDTO("Rahul Verma", "Democratic Front", 5, iterator.next()));
        presidents.add(new PresidentDTO("Sneha Kulkarni", "People’s Party", 6, iterator.next()));
        presidents.add(new PresidentDTO("Aryan Patel", "United Front", 3, iterator.next()));
        presidents.add(new PresidentDTO("Kavya Rao", "Nationalist Party", 2, iterator.next()));
        presidents.add(new PresidentDTO("Rohit Mehra", "Modern India Party", 5, iterator.next()));
        presidents.add(new PresidentDTO("Niharika Das", "Youth Alliance", 4, iterator.next()));
        presidents.add(new PresidentDTO("Imran Shaikh", "People’s Voice", 3, iterator.next()));
        presidents.add(new PresidentDTO("Saanvi Pillai", "Vision India", 6, iterator.next()));
    }

    @Override
    public Set<PresidentDTO> findAll() {
        return presidents;
    }
}
