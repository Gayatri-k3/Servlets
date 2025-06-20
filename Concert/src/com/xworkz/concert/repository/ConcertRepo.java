package com.xworkz.concert.repository;

import com.xworkz.concert.dto.ConcertDTO;

import java.util.Optional;

public interface ConcertRepo {
    boolean persist(ConcertDTO concertDTO);

    default Optional<ConcertDTO> findById(int shoeID)
    {
        return Optional.empty();
    }

}

