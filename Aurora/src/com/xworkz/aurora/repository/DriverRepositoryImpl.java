package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.DriverDTO;
import com.xworkz.aurora.dto.VehicleDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DriverRepositoryImpl implements DriverRepository {

    private final Set<DriverDTO> drivers = new HashSet<>();

    public DriverRepositoryImpl(VehicleRepository vehicleRepository) {
        Iterator<VehicleDTO> iterator = vehicleRepository.findAll().iterator();

        drivers.add(new DriverDTO("Arun", "KA01A1234", 5, iterator.next()));
        drivers.add(new DriverDTO("Vinay", "KA02B5678", 3, iterator.next()));
        drivers.add(new DriverDTO("Manoj", "KA03C9101", 6, iterator.next()));
        drivers.add(new DriverDTO("Ravi", "KA04D2345", 10, iterator.next()));
        drivers.add(new DriverDTO("Suresh", "KA05E6789", 8, iterator.next()));
        drivers.add(new DriverDTO("Naresh", "KA06F1112", 2, iterator.next()));
        drivers.add(new DriverDTO("Mahesh", "KA07G1314", 4, iterator.next()));
        drivers.add(new DriverDTO("Kiran", "KA08H1516", 7, iterator.next()));
        drivers.add(new DriverDTO("Sunil", "KA09J1718", 9, iterator.next()));
        drivers.add(new DriverDTO("Deepak", "KA10K1920", 6, iterator.next()));

        drivers.add(new DriverDTO("Anil", "KA11L2122", 5, iterator.next()));
        drivers.add(new DriverDTO("Raj", "KA12M2324", 11, iterator.next()));
        drivers.add(new DriverDTO("Ajay", "KA13N2526", 3, iterator.next()));
        drivers.add(new DriverDTO("Naveen", "KA14P2728", 6, iterator.next()));
        drivers.add(new DriverDTO("Sanjay", "KA15Q2930", 2, iterator.next()));
        drivers.add(new DriverDTO("Vijay", "KA16R3132", 7, iterator.next()));
        drivers.add(new DriverDTO("Rakesh", "KA17S3334", 8, iterator.next()));
        drivers.add(new DriverDTO("Harish", "KA18T3536", 5, iterator.next()));
        drivers.add(new DriverDTO("Lokesh", "KA19U3738", 4, iterator.next()));
        drivers.add(new DriverDTO("Bharath", "KA20V3940", 6, iterator.next()));

        drivers.add(new DriverDTO("Girish", "KA21W4142", 9, iterator.next()));
        drivers.add(new DriverDTO("Yogesh", "KA22X4344", 5, iterator.next()));
        drivers.add(new DriverDTO("Praveen", "KA23Y4546", 3, iterator.next()));
        drivers.add(new DriverDTO("Charan", "KA24Z4748", 7, iterator.next()));
        drivers.add(new DriverDTO("Umesh", "KA25A4950", 6, iterator.next()));
        drivers.add(new DriverDTO("Tejas", "KA26B5152", 8, iterator.next()));
        drivers.add(new DriverDTO("Ganesh", "KA27C5354", 10, iterator.next()));
        drivers.add(new DriverDTO("Shyam", "KA28D5556", 4, iterator.next()));
        drivers.add(new DriverDTO("Vikram", "KA29E5758", 7, iterator.next()));
        drivers.add(new DriverDTO("Karthik", "KA30F5960", 6, iterator.next()));
    }

    @Override
    public Set<DriverDTO> findAll() {
        return drivers;
    }
}
