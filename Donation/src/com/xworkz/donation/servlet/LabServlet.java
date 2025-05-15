package com.xworkz.donation.servlet;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate", loadOnStartup = 1)
public class LabServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("first");
        String lastName = request.getParameter("last");
        String email = request.getParameter("email");
        String amountStr = request.getParameter("amt");
        String testType = request.getParameter("type");

        Double amount = null;
        if (amountStr != null && !amountStr.trim().isEmpty()) {
            try {
                amount = Double.parseDouble(amountStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount entered.");
            }
        }

        System.out.println("Lab Appointment Request:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Test Type: " + testType);
        System.out.println("Amount: " + amount);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
        dispatcher.forward(request, response);
    }
}
