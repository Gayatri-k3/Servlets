package servlet;

import com.xworkz.myapp.dto.FIRDto;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/FIRSubmit", loadOnStartup = 1)
public class FIRServlet extends HttpServlet {

    public FIRServlet() {
        System.out.println("Running FIRServlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Processing FIR form submission");

        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        String email = req.getParameter("inputemail");
        String date = req.getParameter("date");
        String report = req.getParameter("report");

        System.out.println("Received - fname: " + firstName + ", lname: " + lastName + ", email: " + email + ", date: " + date + ", report: " + report);

        FIRDto firDto = new FIRDto();
        firDto.setFirstName(firstName);
        firDto.setLastName(lastName);
        firDto.setEmail(email);
        firDto.setDate(date);
        firDto.setReport(report);

        req.setAttribute("firDto", firDto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("FIRSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}
