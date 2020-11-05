/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.servlet;

import br.ba.coursera.bean.User;
import br.ba.coursera.dao.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Windows
 */
@WebServlet(urlPatterns={"/signup"})
public class SignupServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("login") != null
                && request.getParameter("email") != null
                && request.getParameter("name") != null
                && request.getParameter("password") != null
                && request.getParameter("points") != null) {

            User u = new User(
                    request.getParameter("login"),
                    request.getParameter("email"),
                    request.getParameter("name"),
                    request.getParameter("password"),
                    Integer.parseInt(request.getParameter("points"))
            );

            new UserDAO().insert(u);

            request.getRequestDispatcher("index.html");
        } else {
            System.out.println("Usuário não cadastrado!!!");
        }

    }

}
