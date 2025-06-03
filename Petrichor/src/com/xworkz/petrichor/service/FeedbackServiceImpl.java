package com.xworkz.petrichor.service;

import com.xworkz.petrichor.dto.FeedbackDto;
import com.xworkz.petrichor.repository.FeedbackRepo;
import com.xworkz.petrichor.repository.FeedbackRepoImpl;

public class FeedbackServiceImpl implements FeedbackService {

    @Override
    public boolean save(FeedbackDto feedbackDto) {
        if (feedbackDto == null) {
            System.err.println("DTO is null");
            return false;
        }

        boolean valid = true;

        if (feedbackDto.getName() == null || feedbackDto.getName().trim().length() < 3) {
            System.err.println("Invalid name");
            valid = false;
        }

        if (feedbackDto.getType() == null || feedbackDto.getType().equalsIgnoreCase("Select")) {
            System.err.println("Invalid course type");
            valid = false;
        }

        if (feedbackDto.getRollno() <= 0) {
            System.err.println("Invalid roll number");
            valid = false;
        }

        if (feedbackDto.getStaffName() == null || feedbackDto.getStaffName().trim().length() < 3) {
            System.err.println("Invalid staff name");
            valid = false;
        }

        if (feedbackDto.getMsg() == null || feedbackDto.getMsg().trim().length() < 10) {
            System.err.println("Feedback description too short");
            valid = false;
        }

        if (valid) {
            System.out.println("Validation passed. Saving: " + feedbackDto);
            System.out.println("All fields are valid, saving ProductDto...");
            FeedbackRepo feedbackRepo = new FeedbackRepoImpl();
            boolean persisted = feedbackRepo.persist(feedbackDto);
            return persisted;
        }

        System.err.println("Validation failed.");
        return false;


    }
}

