package com.xworkz.myapp.servlet;

import com.xworkz.myapp.dto.FbDto;
import com.xworkz.myapp.service.FBService;
import com.xworkz.myapp.service.FBServiceImpl;

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

        FbDto fbDto = new FbDto();
        fbDto.setEmail(email);
        fbDto.setFirstName(firstName);
        fbDto.setLastName(lastName);
        fbDto.setMessage(message);

        FBService fbService = new FBServiceImpl();
        boolean saved= fbService.save(fbDto);
        if(saved) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("FBSuccess.jsp");
            req.setAttribute("fbDto", fbDto);
            req.setAttribute("message", "Feedback Sent");
            requestDispatcher.forward(req, resp);
        }
        else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("FeedBack.jsp");
            req.setAttribute("fbDto", fbDto);
            req.setAttribute("message", "Feedback failed");
        }
    }
}
