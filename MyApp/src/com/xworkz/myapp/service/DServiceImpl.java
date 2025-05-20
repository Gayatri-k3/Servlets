package com.xworkz.myapp.service;

import com.xworkz.myapp.dto.DonationDto;

public class DServiceImpl implements DService{
    @Override
    public boolean save(DonationDto donationDto) {
        String donorName = donationDto.getFirstName();
        if (donorName != null && donorName.length() <= 21 && donorName.length() >=3){
            System.out.println("Donor Name is valid");
        }
        else{
            System.err.println("Donor Name id invalid");
            return false;
        }
        double amount = donationDto.getAmount();
        if(amount>500){
            System.out.println("Donated amount above 500rs");
        }
        else{
            System.err.println("donated amount below 500");
            return false;
        }
        return true;
    }
}
