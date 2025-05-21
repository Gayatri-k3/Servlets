package com.xworkz.symphony.servlets;

import com.xworkz.symphony.dto.ProductDto;
import com.xworkz.symphony.service.ProductService;
import com.xworkz.symphony.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/submit", loadOnStartup = 1)
public class ProductServlet extends HttpServlet {
    public ProductServlet(){
        System.out.println("ruuning no-arg const in ProductServlet");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost in ProductServlet");
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String priceInStr = req.getParameter("priceIn");
        String priceSStr = req.getParameter("priceS");
        String mrpStr = req.getParameter("mrp");
        String desc = req.getParameter("desc");
        String brand = req.getParameter("brand");
        String quantity = req.getParameter("quantity");
        String color = req.getParameter("color");
        String weightStr = req.getParameter("weight");
        String manf = req.getParameter("manf");
        String warranty = req.getParameter("warranty");
        String returnPolicy = req.getParameter("checkChecked");

        Double priceIn = null;
        if (priceInStr != null && !priceInStr.trim().isEmpty()) {
            try {
                priceIn = Double.parseDouble(priceInStr.trim());
            } catch (NumberFormatException e) {
                System.err.println("Invalid priceIn value.");
            }
        }

        Double priceS = null;
        if (priceSStr != null && !priceSStr.trim().isEmpty()) {
            try {
                priceS = Double.parseDouble(priceSStr.trim());
            } catch (NumberFormatException e) {
                System.err.println("Invalid priceS value.");
            }
        }

        Double mrp = null;
        if (mrpStr != null && !mrpStr.trim().isEmpty()) {
            try {
                mrp = Double.parseDouble(mrpStr.trim());
            } catch (NumberFormatException e) {
                System.err.println("Invalid mrp value.");
            }
        }

        Double weight = null;
        if (weightStr != null && !weightStr.trim().isEmpty()) {
            try {
                weight = Double.parseDouble(weightStr.trim());
            } catch (NumberFormatException e) {
                System.err.println("Invalid weight value.");
            }
        }
        ProductDto productDto = new ProductDto();
        productDto.setName(name);
        productDto.setType(type);
        productDto.setPriceIn(priceIn);
        productDto.setPriceS(priceS);
        productDto.setMrp(mrp);
        productDto.setDesc(desc);
        productDto.setBrand(brand);
        productDto.setQuantity(quantity);
        productDto.setColor(color);
        productDto.setWeight(weight);
        productDto.setManfDate(manf);
        productDto.setWarranty(warranty);
        productDto.setReturnPolicy(returnPolicy);



        ProductService productService = new ProductServiceImpl();
        boolean saved = productService.save(productDto);
        if(saved){
            RequestDispatcher reqD = req.getRequestDispatcher("ProductSuccess.jsp");
            req.setAttribute("msgS","Save Success");
            req.setAttribute("productDto", productDto);
            reqD.forward(req, resp);
        }
        else{
            RequestDispatcher reqD = req.getRequestDispatcher("product.jsp");
            req.setAttribute("msg","Save failed");
            req.setAttribute("productDto", productDto);
            reqD.forward(req, resp);
        }

    }
}
