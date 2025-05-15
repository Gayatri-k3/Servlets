package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register")
public class Servlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        String contactnum = servletRequest.getParameter("contactnumber");
        long cnum = 0;
        if (contactnum != null) {
            cnum = Long.parseLong(contactnum);
        }
        String noticket = servletRequest.getParameter("numberofticket");
        int ticket = 0;
        if (noticket != null) {
            ticket = Integer.parseInt(noticket);
        }
        String price = servletRequest.getParameter("ticketprice");
        int rate = 0;
        if (price != null) {
            rate = Integer.parseInt(price);
        }
        int total = rate * ticket;
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1>You have Succesfully Registered for the concert</h1>");
        writer.println("<h2>Total Price is: </h2>" + total);
    }
}
