package com.xworkz.petrichor.repository;

import com.xworkz.petrichor.dto.FeedbackDto;
import com.xworkz.petrichor.service.FeedbackServiceImpl;

public class FeedbackRepoImpl implements FeedbackRepo{

    public FeedbackRepoImpl(){
        System.out.println("running no-arg const of repo impl");
    }
    @Override
    public boolean persist(FeedbackDto feedbackDto) {
        System.out.println("persist method in feedback Repository Implementation");
        return true;
    }
}
