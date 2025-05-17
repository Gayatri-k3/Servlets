package com.xworkz.furniture.servlet;

import com.xworkz.furniture.dto.Furnituredto;

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

        Furnituredto furnituredto = new Furnituredto();
        furnituredto.setBrand(brand);
        furnituredto.setMaterial(material);
        furnituredto.setModel(model);
        furnituredto.setSize(size);
        furnituredto.setProductBenefits(productBenefits);

        RequestDispatcher rd = req.getRequestDispatcher("Success.jsp");
        req.setAttribute("furnituredto", furnituredto);
        rd.forward(req, resp);
    }
}
