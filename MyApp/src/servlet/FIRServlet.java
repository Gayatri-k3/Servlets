package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/FIRSubmit", loadOnStartup = 1)
public class FIRServlet extends HttpServlet {
    public FIRServlet() {
        System.out.println("Running fir servlet const");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running FIR");

        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        String email = req.getParameter("inputemail");
        String date = req.getParameter("date");
        String report = req.getParameter("report");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("FIRSuccess.jsp");
        req.setAttribute("firstName", firstName);
        req.setAttribute("lastName", lastName);
        req.setAttribute("email", email);
        req.setAttribute("date", date);
        req.setAttribute("report", report);
        requestDispatcher.forward(req, resp);
    }
}
