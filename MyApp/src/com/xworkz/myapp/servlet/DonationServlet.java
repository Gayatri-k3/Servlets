package com.xworkz.myapp.servlet;

import com.xworkz.myapp.dto.DonationDto;
import com.xworkz.myapp.service.DonationService;
import com.xworkz.myapp.service.DonationServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate", loadOnStartup = 1)
public class DonationServlet extends HttpServlet {
    public DonationServlet(){
        System.out.println("running Donation const");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running Donation");

            String firstName = req.getParameter("inputFN");
            String lastName = req.getParameter("inputLN");
            String email = req.getParameter("exampleFormControlInput1");
            String amountStr = req.getParameter("inputnum");
            String cause = req.getParameter("inputcause");

            Double amount = null;
            if (amountStr != null && !amountStr.trim().isEmpty()) {
                try {
                    amount = Double.parseDouble(amountStr);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid amount entered.");
                }
            }
        DonationDto donationDto = new DonationDto();
        donationDto.setFirstName(firstName);
        donationDto.setLastName(lastName);
        donationDto.setAmount(amount);
        donationDto.setCause(cause);
        donationDto.setEmail(email);

        DonationService donationService = new DonationServiceImpl();
        boolean saved = donationService.save(donationDto);
        if(saved){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("DonationSuccess.jsp");
            req.setAttribute("donationDto", donationDto);
            req.setAttribute("message", "donated successfully");
            requestDispatcher.forward(req,resp);
        }
        else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Donation.jsp");
            req.setAttribute("donationDto", donationDto);
            req.setAttribute("message", "Donation failed");
            requestDispatcher.forward(req,resp);
        }
    }
}