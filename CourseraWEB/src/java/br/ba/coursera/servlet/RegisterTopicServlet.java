/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.servlet;

import br.ba.coursera.bean.Topic;
import br.ba.coursera.bean.User;
import br.ba.coursera.dao.TopicDAO;
import java.io.IOException;
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
@WebServlet(urlPatterns = {"/registerTopic"})
public class RegisterTopicServlet extends HttpServlet {

    int cont = 0;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        HttpSession session = request.getSession();
        System.out.println(session.getAttribute("User"));
            
        if (request.getParameter("title") != null
                || request.getParameter("description") != null) {

            Topic t = new Topic(
                    request.getParameter("title"),
                    (User) session.getAttribute("User"),
                    request.getParameter("description")
            );

            new TopicDAO().insert(t);
            
            request.getRequestDispatcher("topics.jsp").forward(request, response);
        } else {
            System.out.println("Tópico não cadastrado!!!");
        }

    }

}
