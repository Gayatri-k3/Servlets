package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/FBSubmit", loadOnStartup = 1)
public class FBServlet extends HttpServlet {

    public FBServlet() {
        System.out.println("Running FeedBack Servlet");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("inputfn");
        String lastName = req.getParameter("inputln");
        String email = req.getParameter("em");
        String message = req.getParameter("msg");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fbSuccess.jsp");
        req.setAttribute("First Name", firstName);
        req.setAttribute("Last Name", lastName);
        req.setAttribute("Email", email);
        req.setAttribute("Message", message);

        requestDispatcher.forward(req, resp);
    }
}
