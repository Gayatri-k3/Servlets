package com.xworkz.furniture.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/furniture")
public class Servlet extends HttpServlet {
    public Servlet(){
        System.out.println("Running Servlet in furniture");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running post in servlet");

        String brand = req.getParameter("inputFN");
        String model = req.getParameter("inputLN");
        String material = req.getParameter("inputM");
        String size = req.getParameter("size");
        String productBenefits = req.getParameter("msg");

        RequestDispatcher reqD= req.getRequestDispatcher("Success.jsp");
        req.setAttribute("Brand", brand);
        req.setAttribute("model", model);
        req.setAttribute("material",material);
        req.setAttribute("size", size);
        req.setAttribute("product benefits", productBenefits);

        reqD.forward(req, resp);
    }
}
