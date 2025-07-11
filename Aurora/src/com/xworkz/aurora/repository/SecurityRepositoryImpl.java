package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.DetailDTO;
import com.xworkz.aurora.dto.JobDTO;
import com.xworkz.aurora.dto.SecurityDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SecurityRepositoryImpl implements SecurityRepository {
    private final Set<SecurityDTO> securities = new HashSet<>();

    public SecurityRepositoryImpl(JobRepository jobRepository) {
        Iterator<JobDTO> iterator = jobRepository.findAll().iterator();

        securities.add(new SecurityDTO("Ramesh", 35, "Night", iterator.next()));
        securities.add(new SecurityDTO("Suresh", 40, "Day", iterator.next()));
        securities.add(new SecurityDTO("Mahesh", 30, "Night", iterator.next()));
        securities.add(new SecurityDTO("Naresh", 45, "Day", iterator.next()));
        securities.add(new SecurityDTO("Kiran", 33, "Night", iterator.next()));
        securities.add(new SecurityDTO("Rajesh", 38, "Day", iterator.next()));
        securities.add(new SecurityDTO("Lokesh", 32, "Night", iterator.next()));
        securities.add(new SecurityDTO("Ganesh", 36, "Day", iterator.next()));
        securities.add(new SecurityDTO("Dinesh", 41, "Night", iterator.next()));
        securities.add(new SecurityDTO("Vignesh", 34, "Day", iterator.next()));

        securities.add(new SecurityDTO("Manoj", 29, "Night", iterator.next()));
        securities.add(new SecurityDTO("Vinod", 37, "Day", iterator.next()));
        securities.add(new SecurityDTO("Harish", 43, "Night", iterator.next()));
        securities.add(new SecurityDTO("Satish", 31, "Day", iterator.next()));
        securities.add(new SecurityDTO("Deepak", 39, "Night", iterator.next()));
        securities.add(new SecurityDTO("Rohit", 28, "Day", iterator.next()));
        securities.add(new SecurityDTO("Sanjay", 42, "Night", iterator.next()));
        securities.add(new SecurityDTO("Karthik", 36, "Day", iterator.next()));
        securities.add(new SecurityDTO("Yogesh", 33, "Night", iterator.next()));
        securities.add(new SecurityDTO("Vikram", 44, "Day", iterator.next()));

        securities.add(new SecurityDTO("Naveen", 30, "Night", iterator.next()));
        securities.add(new SecurityDTO("Ravi", 37, "Day", iterator.next()));
        securities.add(new SecurityDTO("Pavan", 40, "Night", iterator.next()));
        securities.add(new SecurityDTO("Sunil", 35, "Day", iterator.next()));
        securities.add(new SecurityDTO("Ajay", 38, "Night", iterator.next()));
        securities.add(new SecurityDTO("Suraj", 29, "Day", iterator.next()));
        securities.add(new SecurityDTO("Vijay", 34, "Night", iterator.next()));
        securities.add(new SecurityDTO("Anil", 41, "Day", iterator.next()));
        securities.add(new SecurityDTO("Bharath", 32, "Night", iterator.next()));
        securities.add(new SecurityDTO("Chandru", 39, "Day", iterator.next()));
    }

    @Override
    public Set<SecurityDTO> findAll() {
        return securities;
    }
}
