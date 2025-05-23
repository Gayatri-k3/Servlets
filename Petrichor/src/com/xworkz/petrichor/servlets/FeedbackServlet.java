package com.xworkz.petrichor.servlets;

import com.xworkz.petrichor.dto.FeedbackDto;
import com.xworkz.petrichor.service.FeedbackService;
import com.xworkz.petrichor.service.FeedbackServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.IconUIResource;
import java.io.IOException;

@WebServlet(urlPatterns = "/submit", loadOnStartup = 1)
public class FeedbackServlet extends HttpServlet {
    public FeedbackServlet(){
        System.out.println("Running no-arg const in servlet");
    }
    private FeedbackService feedbackService;

    @Override
    public void init() throws ServletException {
        this.feedbackService = new FeedbackServiceImpl();
        System.out.println("FeedbackServiceImpl created in init()");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost in FeedbackServlet");

        String name = req.getParameter("name");
        String course = req.getParameter("type");
        String rollnoStr = req.getParameter("rollno");
        String staffName = req.getParameter("Sname");
        String desc = req.getParameter("desc");

        Integer rollno = null;
        if (rollnoStr != null && !rollnoStr.trim().isEmpty()) {
            try {
                rollno = Integer.parseInt(rollnoStr.trim());
            } catch (NumberFormatException e) {
                System.err.println("Invalid roll number format.");
            }
        }

        FeedbackDto feedbackDto = new FeedbackDto();
        feedbackDto.setName(name);
        feedbackDto.setType(course);
        feedbackDto.setRollno(rollno);
        feedbackDto.setStaffName(staffName);
        feedbackDto.setMsg(desc);

        boolean saved = feedbackService.save(feedbackDto);

        if (saved) {
            req.setAttribute("msg", "Feedback saved successfully");
            req.setAttribute("feedback", feedbackDto);
            RequestDispatcher dispatcher = req.getRequestDispatcher("FeedbackSuccess.jsp");
            dispatcher.forward(req, resp);
        } else {
            req.setAttribute("msg", "Feedback save failed. Please check input.");
            req.setAttribute("feedback", feedbackDto);
            RequestDispatcher dispatcher = req.getRequestDispatcher("Feedback.jsp");
            dispatcher.forward(req, resp);
        }
    }
}