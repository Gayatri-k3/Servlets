package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.VehicleDTO;
import com.xworkz.aurora.dto.CompanyDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VehicleRepositoryImpl implements VehicleRepository {

    private final Set<VehicleDTO> vehicles = new HashSet<>();

    public VehicleRepositoryImpl(CompanyRepository companyRepository) {
        Iterator<CompanyDTO> iterator = companyRepository.findAll().iterator();

        vehicles.add(new VehicleDTO("Car", "Model S", "Red", iterator.next()));
        vehicles.add(new VehicleDTO("Truck", "Cybertruck", "Silver", iterator.next()));
        vehicles.add(new VehicleDTO("Bike", "Apache RTR", "Black", iterator.next()));
        vehicles.add(new VehicleDTO("Scooter", "Activa 6G", "White", iterator.next()));
        vehicles.add(new VehicleDTO("SUV", "XUV700", "Blue", iterator.next()));
        vehicles.add(new VehicleDTO("Sedan", "City", "Grey", iterator.next()));
        vehicles.add(new VehicleDTO("Hatchback", "Swift", "Yellow", iterator.next()));
        vehicles.add(new VehicleDTO("Electric", "Nexon EV", "Green", iterator.next()));
        vehicles.add(new VehicleDTO("Luxury", "BMW X5", "Black", iterator.next()));
        vehicles.add(new VehicleDTO("Pickup", "Ranger", "Orange", iterator.next()));

        vehicles.add(new VehicleDTO("Car", "Altroz", "Gold", iterator.next()));
        vehicles.add(new VehicleDTO("SUV", "Creta", "Red", iterator.next()));
        vehicles.add(new VehicleDTO("Bike", "FZ-S", "Blue", iterator.next()));
        vehicles.add(new VehicleDTO("Truck", "Volvo FH", "White", iterator.next()));
        vehicles.add(new VehicleDTO("Sedan", "Camry", "Silver", iterator.next()));
        vehicles.add(new VehicleDTO("Luxury", "Audi Q7", "Black", iterator.next()));
        vehicles.add(new VehicleDTO("Scooter", "Jupiter", "Pink", iterator.next()));
        vehicles.add(new VehicleDTO("Electric", "Ather 450X", "Green", iterator.next()));
        vehicles.add(new VehicleDTO("Hatchback", "Tiago", "Blue", iterator.next()));
        vehicles.add(new VehicleDTO("SUV", "Venue", "Teal", iterator.next()));

        vehicles.add(new VehicleDTO("Car", "Kwid", "Orange", iterator.next()));
        vehicles.add(new VehicleDTO("Bike", "Pulsar NS", "Red", iterator.next()));
        vehicles.add(new VehicleDTO("Electric", "MG ZS EV", "White", iterator.next()));
        vehicles.add(new VehicleDTO("Sedan", "Verna", "Black", iterator.next()));
        vehicles.add(new VehicleDTO("Truck", "Tata Ace", "Grey", iterator.next()));
        vehicles.add(new VehicleDTO("SUV", "Fortuner", "Beige", iterator.next()));
        vehicles.add(new VehicleDTO("Luxury", "Jaguar XF", "Blue", iterator.next()));
        vehicles.add(new VehicleDTO("Scooter", "Ola S1", "Yellow", iterator.next()));
        vehicles.add(new VehicleDTO("Car", "Baleno", "Red", iterator.next()));
        vehicles.add(new VehicleDTO("Bike", "RE Classic", "Maroon", iterator.next()));
    }

    @Override
    public Set<VehicleDTO> findAll() {
        return vehicles;
    }
}
