package com.xworkz.donation.servlet;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/LicenseSubmit", loadOnStartup = 1)
public class LDServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String fName = request.getParameter("fn");
        String lName = request.getParameter("ln");
        String email = request.getParameter("exampleFormControlInput1");
        String vehicleType = request.getParameter("tv");
        String vehicleNumber = request.getParameter("vn");

        System.out.println("License Application Received:");
        System.out.println("Name: " + fName + " " + lName);
        System.out.println("Email: " + email);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Vehicle Number: " + vehicleNumber);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
        dispatcher.forward(request, response);
    }
}
