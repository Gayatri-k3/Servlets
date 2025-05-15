package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/FIRSubmit", loadOnStartup = 1)
public class FIRServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        String email = req.getParameter("inputemail");
        String date = req.getParameter("date");
        String report = req.getParameter("report");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
        req.setAttribute("First Name", firstName);
        req.setAttribute("Last Name", lastName);
        req.setAttribute("Email", email);
        req.setAttribute("Date", date);
        req.setAttribute("Report", report);
        requestDispatcher.forward(req, resp);
    }
}
