package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/LicenseSubmit", loadOnStartup = 1)
public class LDServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("fn");
        String lastName = req.getParameter("ln");
        String email = req.getParameter("exampleFormControlInput1");
        String vehicleType = req.getParameter("tv");
        String vehicleNumber = req.getParameter("vn");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
        req.setAttribute("First Name", firstName);
        req.setAttribute("Last Name", lastName);
        req.setAttribute("Email", email);
        req.setAttribute("Vehicle Type", vehicleType);
        req.setAttribute("Vehicle Number", vehicleNumber);
        requestDispatcher.forward(req, resp);
    }
}
