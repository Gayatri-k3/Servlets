package com.xworkz.concert.service;

import com.xworkz.concert.dto.ConcertDTO;

import java.util.Optional;

public interface ConcertService {
    boolean save (ConcertDTO concertDTO);

    default Optional<ConcertDTO> findById(int shoeID)
    {
        return Optional.empty();
    }
}
