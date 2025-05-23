package com.xworkz.petrichor.repository;

import com.xworkz.petrichor.dto.FeedbackDto;
import com.xworkz.petrichor.service.FeedbackService;

public interface FeedbackRepo {
    boolean persist(FeedbackDto feedbackDto);
}
