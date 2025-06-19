package com.xworkz.castle.servlet;

import com.xworkz.castle.dto.ShoeDTO;
import com.xworkz.castle.service.ShoeService;
import com.xworkz.castle.service.ShoeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

@WebServlet(urlPatterns = "/shoe", loadOnStartup = 1)
public class ShoeServlet extends HttpServlet {
    public ShoeServlet(){
        System.out.println("running no-arg const of Shoe servlet");
    }
    ShoeService shoeService=new ShoeServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String brand = req.getParameter("brand");
        String material = req.getParameter("material");
        String type = req.getParameter("type");
        String manDate = req.getParameter("manDate");
        LocalDate manuDate = null;
        if(manDate != null){
            try {
                manuDate = LocalDate.parse(manDate);
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
        String size = req.getParameter("size");
        Double sizeD = null;
        if(size!=null){
            try{
                sizeD=Double.parseDouble(size);
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        String payment = req.getParameter("payment");
        Boolean paymentB = null;
        if(payment!=null){
            try{
                paymentB = Boolean.parseBoolean(payment);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        ShoeDTO shoeDTO = new ShoeDTO();
        shoeDTO.setBrand(brand);
        shoeDTO.setType(type);
        shoeDTO.setSize(sizeD);
        shoeDTO.setPayment(payment);
        shoeDTO.setMaterial(material);
        shoeDTO.setManDate(manuDate);

        System.out.println("shoe details: "+shoeDTO);
        ShoeService shoeService = new ShoeServiceImpl();
        boolean saved =shoeService.save(shoeDTO);
        if(saved){
            req.setAttribute("Success", "Data is Valid");
            System.out.println("Success");
        }
        else {
            req.setAttribute("Failed", "Data is Invalid");
            System.out.println("Failed");
            req.setAttribute("ShoeDTO", shoeDTO);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Shoe.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet method in Shoe servlet");
        String shoeIDStr=req.getParameter("shoeID");
        if (shoeIDStr != null && !shoeIDStr.isEmpty())
        {
            int shoeID=Integer.parseInt(shoeIDStr);

            Optional<ShoeDTO> optionalShoeDTO= shoeService.findById(shoeID);
            if(optionalShoeDTO.isPresent()) {
                System.out.println("shoe Id is found");
                ShoeDTO shoeDTO = optionalShoeDTO.get();
                req.setAttribute("message", "shoe Details");
                req.setAttribute("shoeDTO", shoeDTO);
            }
            else {
                System.out.println("shoe Id is not found");
                req.setAttribute("errorMessage","shoe Id is not Found");
            }
            RequestDispatcher  requestDispatcher = req.getRequestDispatcher("ShoeFindId.jsp");
            requestDispatcher.forward(req,resp);

        }
        ShoeDTO[] shoeDtos = shoeService.findAll();
        req.setAttribute("shoeDtos", shoeDtos);
        resp.setContentType("text/html");

        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req, resp);
    }
}

