package com.xworkz.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate", loadOnStartup = 1)
public class Servlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("inputFN");
        String lastName = request.getParameter("inputLN");
        String email = request.getParameter("exampleFormControlInput1");
        String amountStr = request.getParameter("inputnum");
        String cause = request.getParameter("inputcause");

        Double amount = null;
        if (amountStr != null && !amountStr.trim().isEmpty()) {
            try {
                amount = Double.parseDouble(amountStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount entered.");
            }
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Success.jsp");
        requestDispatcher.forward(request,response);
    }
}