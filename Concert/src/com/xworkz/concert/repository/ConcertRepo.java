package com.xworkz.concert.repository;

import com.xworkz.concert.dto.ConcertDTO;

public interface ConcertRepo {
    boolean persist(ConcertDTO concertDTO);
}
