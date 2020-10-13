/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Windows
 */
@WebServlet("/conversor")
public class ConversorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        float value = Float.parseFloat(request.getParameter("value"));
        int temperature = Integer.parseInt(request.getParameter("radio"));
        float result = 0;
        
        System.out.println(value);
        System.out.println(temperature);
                
        switch (temperature) {
            case 0:
                result = ((value - 32) * 5) / 9;
                System.out.println(result);
                break;
            case 1:
                result = ((value * 9) / 5) + 32;
                break;
            default:
                break;
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Conversor de temperatura</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado: " + result + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
