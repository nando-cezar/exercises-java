/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.servlet;

import br.ba.coursera.bean.Topic;
import br.ba.coursera.bean.User;
import br.ba.coursera.dao.TopicDAO;
import br.ba.coursera.dao.UserDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Windows
 */
@WebServlet(urlPatterns = {"/authentication"})
public class AuthenticationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        User user = new UserDAO().authentication(login, password);

        if (user != null) {
            List<Topic> listTopics = new TopicDAO().recovery();
            request.setAttribute("Topics", listTopics);
            
            HttpSession session = request.getSession();
            session.setAttribute("User", user);
            
            request.getRequestDispatcher("topics.jsp").forward(request, response);
            
        } else {
            System.out.println("Usuário não encontrado!!!");
        }

    }

}
