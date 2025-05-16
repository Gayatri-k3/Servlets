package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/lab", loadOnStartup = 1)
public class LabServlet extends HttpServlet {
    public LabServlet(){
        System.out.println("Running lab const");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running lab ");

        String firstName = req.getParameter("first");
        String lastName = req.getParameter("last");
        String email = req.getParameter("email");
        String amountStr = req.getParameter("amt");
        String testType = req.getParameter("type");

        Double amount = null;
        if (amountStr != null && !amountStr.trim().isEmpty()) {
            try {
                amount = Double.parseDouble(amountStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount entered.");
            }
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("LabSuccess.jsp");
        req.setAttribute("firstName", firstName);
        req.setAttribute("lastName", lastName);
        req.setAttribute("email", email);
        req.setAttribute("amount", amount);
        req.setAttribute("testType", testType);
        requestDispatcher.forward(req, resp);
    }
}
