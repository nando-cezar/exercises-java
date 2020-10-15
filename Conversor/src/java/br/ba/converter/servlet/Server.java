package br.ba.converter.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ba.converter.beans.Conversor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/conversorTemp")
public class Server extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                        
        Conversor conv = new Conversor(
                Double.parseDouble(request.getParameter("value")), 
                request.getParameter("op").charAt(0)
        );
        conv.Converter();
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Conversor de temperatura</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado: " + conv.getResultado() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
