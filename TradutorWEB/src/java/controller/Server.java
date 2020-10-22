/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tradutor;

/**
 *
 * @author Windows
 */
@WebServlet("/tradutor")
public class Server extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //pegar parametros
        //chamar regra de negocio
        //passar controle para view
        String value = new Tradutor().getTranslationValue(request.getParameter("value"));
        if (value != null) {
            request.setAttribute("Translation", value);
            request.getRequestDispatcher("tradutor.jsp").forward(request, response);
        }else{
            request.setAttribute("Translation", request.getParameter("value"));
            request.getRequestDispatcher("tradutor.jsp").forward(request, response);
        }

    }

}
