package servlet;

import com.xworkz.myapp.dto.LabDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/lab", loadOnStartup = 1)
public class LabServlet extends HttpServlet {
    public LabServlet() {
        System.out.println("Running LabServlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running LabServlet doPost()");

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

        LabDto labdto = new LabDto();
        labdto.setFirstName(firstName);
        labdto.setLastName(lastName);
        labdto.setEmail(email);
        labdto.setTestType(testType);
        labdto.setAmount(amount);

        System.out.println("LabDto: " + labdto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("LabSuccess.jsp");
        if (dispatcher != null) {
            req.setAttribute("labdto", labdto);
            dispatcher.forward(req, resp);
        } else {
            resp.getWriter().write("LabSuccess.jsp not found.");
        }
    }
}
