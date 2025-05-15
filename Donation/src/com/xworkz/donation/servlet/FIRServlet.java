package com.xworkz.donation.servlet;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/FIRSubmit", loadOnStartup = 1)
public class FIRServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String contact = request.getParameter("inputemail");
        String date = request.getParameter("date");
        String report = request.getParameter("report");

        System.out.println("FIR Submitted:");
        System.out.println("Name: " + fname + " " + lname);
        System.out.println("Email: " + contact);
        System.out.println("Date: " + date);
        System.out.println("Report: " + report);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
        dispatcher.forward(request, response);
    }
}
