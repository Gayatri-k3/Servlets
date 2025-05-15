package doctorAppt;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/appt", loadOnStartup = 1)
public class AServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String contactNumberStr = request.getParameter("contactNumber");
        String gender = request.getParameter("gender");
        String ageStr = request.getParameter("age");
        String sickness = request.getParameter("sickness");

        Long contactNumber = null;
        Integer age = null;

        if (contactNumberStr != null) {
            try {
                contactNumber = Long.parseLong(contactNumberStr);
            } catch (NumberFormatException e) {
                contactNumber = null;
            }
        }

        if (ageStr != null) {
            try {
                age = Integer.parseInt(ageStr);
            } catch (NumberFormatException e) {
                age = null;
            }
        }

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<html><head><title>Appointment Confirmed!</title>");
        writer.println("<style>");
        writer.println("body { font-family: 'Segoe UI', Tahoma, sans-serif; background-color: #fff0f5; padding: 40px; color: #4b2e2e; }");
        writer.println("h2 { color: #d63384; }");
        writer.println("p { font-size: 18px; margin: 10px 0; }");
        writer.println("hr { border: 0; height: 2px; background-color: #ffc0cb; margin: 20px 0; }");
        writer.println(".container { max-width: 700px; margin: auto; background: #ffe6f0; padding: 30px; border-radius: 15px; box-shadow: 0 0 10px rgba(221, 160, 221, 0.3); }");
        writer.println("</style>");
        writer.println("</head><body>");
        writer.println("<div class='container'>");
        writer.println("<h2> Appointment Successfully Booked!</h2>");
        writer.println("<hr>");
        writer.println("<p><strong>Full Name:</strong> " + firstName + " " + lastName + "</p>");
        writer.println("<p><strong>Address:</strong> " + address + "</p>");
        writer.println("<p><strong>Email:</strong> " + email + "</p>");
        writer.println("<p><strong>Contact Number:</strong> " + (contactNumber != null ? contactNumber : "<span style='color:red;'>Invalid or Missing</span>") + "</p>");
        writer.println("<p><strong>Gender:</strong> " + gender + "</p>");
        writer.println("<p><strong>Age:</strong> " + (age != null ? age : "<span style='color:red;'>Invalid or Missing</span>") + "</p>");
        writer.println("<p><strong>Sickness:</strong> " + sickness + "</p>");
        writer.println("<hr>");
        writer.println("<p>Thank you for booking with <strong>XYZ Hospital</strong>. We’ll see you soon!</p>");
        writer.println("</div>");
        writer.println("</body></html>");
    }
}