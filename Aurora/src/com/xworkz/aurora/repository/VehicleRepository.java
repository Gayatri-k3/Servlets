package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.VehicleDTO;
import javafx.scene.effect.SepiaTone;

import java.util.Set;

public interface VehicleRepository {
    Set<VehicleDTO> findAll();
}
