package com.xworkz.concert.servlet;

import com.xworkz.concert.dto.ConcertDTO;
import com.xworkz.concert.service.ConcertService;
import com.xworkz.concert.service.ConcertServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/findConcert", loadOnStartup = 1 )
public class FindByIdServlet extends HttpServlet {

    public FindByIdServlet() {
        System.out.println("ConcertFindServlet constructor");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet method in ConcertFindServlet");

        String concertIDStr = req.getParameter("id");
        String findAllParam = req.getParameter("findAll");
        ConcertService concertService = new ConcertServiceImpl();

        if (concertIDStr != null && !concertIDStr.isEmpty()) {
            try {
                int concertID = Integer.parseInt(concertIDStr);
                Optional<ConcertDTO> optionalConcert = concertService.findById(concertID);

                if (optionalConcert.isPresent()) {
                    System.out.println("Concert ID found");
                    ConcertDTO concertDTO = optionalConcert.get();
                    req.setAttribute("message", "Concert Details Found");
                    req.setAttribute("concertDTO", concertDTO);
                } else {
                    System.out.println("Concert ID not found");
                    req.setAttribute("errorMessage", "Concert ID not found");
                }

                RequestDispatcher dispatcher = req.getRequestDispatcher("FindById.jsp");
                dispatcher.forward(req, resp);
                return;

            } catch (NumberFormatException e) {
                System.out.println("Invalid concert ID format");
                req.setAttribute("errorMessage", "Concert ID must be a number");
                RequestDispatcher dispatcher = req.getRequestDispatcher("FindById.jsp");
                dispatcher.forward(req, resp);
                return;
            }
        }

    }
}
