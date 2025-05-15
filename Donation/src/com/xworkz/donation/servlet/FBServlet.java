package com.xworkz.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/FBSubmit", loadOnStartup = 2)
public class FBServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("inputfn");
        String lastName = request.getParameter("inputln");
        String email = request.getParameter("em");
        String message = request.getParameter("msg");

        System.out.println("Feedback Submission:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
        dispatcher.forward(request, response);
    }
}
