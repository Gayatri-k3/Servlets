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
        System.out.println("Running FeedBack Servlet const");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running feedback");

        String firstName = req.getParameter("inputfn");
        String lastName = req.getParameter("inputln");
        String email = req.getParameter("em");
        String message = req.getParameter("msg");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("FBSuccess.jsp");
        req.setAttribute("firstName", firstName);
        req.setAttribute("lastName", lastName);
        req.setAttribute("email", email);
        req.setAttribute("message", message);

        requestDispatcher.forward(req, resp);
    }
}
