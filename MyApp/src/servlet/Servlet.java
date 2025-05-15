package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate", loadOnStartup = 1)
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

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

    RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
            req.setAttribute("First Name", firstName);
            req.setAttribute("Last Name", lastName);
            req.setAttribute("Email", email);
            req.setAttribute("Amount", amount);
            req.setAttribute("Cause", cause);
        requestDispatcher.forward(req,resp);
    }
}