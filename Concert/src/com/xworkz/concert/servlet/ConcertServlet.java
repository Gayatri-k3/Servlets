package com.xworkz.concert.servlet;

import com.xworkz.concert.dto.ConcertDTO;
import com.xworkz.concert.service.ConcertService;
import com.xworkz.concert.service.ConcertServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/concert", loadOnStartup = 1)
public class ConcertServlet extends HttpServlet {
    public ConcertServlet(){
        System.out.println("servlet const");
    }
    ConcertService concertService = new ConcertServiceImpl();
    ConcertDTO concertDTO = new ConcertDTO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String numberS = req.getParameter("num");
        Long number = null;
        if(numberS!=null) {
            try {
                number = Long.parseLong(numberS);
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        String aName = req.getParameter("aName");
        String location = req.getParameter("location");

        concertDTO.setName(name);
        concertDTO.setEmail(email);
        concertDTO.setLocation(location);
        concertDTO.setNumber(number);
        concertDTO.setAName(aName);

        System.out.println("ConcertDto" +concertDTO);
        if(concertService.save(concertDTO)){
            System.out.println("Success");
        }
        else{
            System.out.println("failed");
            req.setAttribute("ConcertDto",concertDTO);
        }


    }
}
