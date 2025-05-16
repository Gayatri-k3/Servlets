package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate", loadOnStartup = 1)
public class Servlet extends HttpServlet {
    public Servlet(){
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

    RequestDispatcher requestDispatcher = req.getRequestDispatcher("DSuccess.jsp");
            req.setAttribute("firstName", firstName);
            req.setAttribute("lastName", lastName);
            req.setAttribute("email", email);
            req.setAttribute("amount", amount);
            req.setAttribute("cause", cause);
        requestDispatcher.forward(req,resp);
    }
}