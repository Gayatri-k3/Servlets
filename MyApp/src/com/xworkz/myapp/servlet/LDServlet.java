package com.xworkz.myapp.servlet;

import com.xworkz.myapp.dto.LdDto;
import com.xworkz.myapp.service.LDService;
import com.xworkz.myapp.service.LDServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/LicenseSubmit", loadOnStartup = 1)
public class LDServlet extends HttpServlet {
    public LDServlet(){
        System.out.println("running license const");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running LD");

        String fn = req.getParameter("fn");
        String ln = req.getParameter("ln");
        String em = req.getParameter("exampleFormControlInput1");
        String vehicleType = req.getParameter("tv");
        String vehicleNumber = req.getParameter("vn");

        LdDto ldDto= new LdDto();
        ldDto.setVehicleType(vehicleType);
        ldDto.setEm(em);
        ldDto.setVehicleNumber(vehicleNumber);
        ldDto.setFn(fn);
        ldDto.setLn(ln);

        LDService ldService = new LDServiceImpl();
        boolean saved = ldService.save(ldDto);
        if(saved) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("LDSuccess.jsp");
            req.setAttribute("ldDto", ldDto);
            req.setAttribute("message","License registered successfully ");
            requestDispatcher.forward(req, resp);
        }
        else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("LicenseDetails.jsp");
            req.setAttribute("ldDto", ldDto);
            req.setAttribute("message","License registration failed ");
            requestDispatcher.forward(req, resp);
        }
    }
}
