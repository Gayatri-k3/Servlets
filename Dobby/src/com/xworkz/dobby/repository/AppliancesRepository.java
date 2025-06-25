package com.xworkz.dobby.repository;

import com.xworkz.dobby.dto.AppliancesDto;
import javafx.print.Collation;

import java.io.Serializable;
import java.util.Collection;

public interface AppliancesRepository extends Serializable {
    Collection<AppliancesDto> findAll();
}
