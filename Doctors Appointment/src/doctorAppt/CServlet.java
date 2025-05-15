package doctorAppt;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/contact", loadOnStartup = 1)
public class CServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("inputFN");
        String lastName = request.getParameter("inputLN");
        String email = request.getParameter("exampleFormControlInput1");
        String message = request.getParameter("msg");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<head><title>Contact Confirmation</title>");
        writer.println("<style>");
        writer.println("body { font-family: 'Segoe UI', Tahoma, sans-serif; background-color: #fff0f5; padding: 30px; color: #4b2e2e; }");
        writer.println("h1, h2 { color: #d63384; text-align: center; }");
        writer.println("table { border-collapse: collapse; width: 70%; margin: 30px auto; background-color: #ffe6f0; border-radius: 10px; box-shadow: 0 0 10px rgba(221, 160, 221, 0.2); }");
        writer.println("th, td { padding: 14px 22px; border: 1px solid #ffc0cb; font-size: 16px; }");
        writer.println("th { background-color: #ffb6c1; color: white; }");
        writer.println("</style>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1> Your Query Has Been Received!</h1>");
        writer.println("<h2>We will get back to you as soon as possible!</h2>");
        writer.println("<table>");
        writer.println("<tr><th>Field</th><th>Value</th></tr>");
        writer.println("<tr><td>First Name</td><td>" + firstName + "</td></tr>");
        writer.println("<tr><td>Last Name</td><td>" + lastName + "</td></tr>");
        writer.println("<tr><td>Email</td><td>" + email + "</td></tr>");
        writer.println("<tr><td>Message</td><td>" + message + "</td></tr>");
        writer.println("</table>");
        writer.println("</body></html>");
    }
}
