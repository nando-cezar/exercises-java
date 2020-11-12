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
@WebServlet(urlPatterns = {"/registerTopic"})
public class RegisterTopicServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        HttpSession session = request.getSession();  
        
        if (request.getParameter("title") != null
                || request.getParameter("description") != null) {

            Topic t = new Topic(
                    request.getParameter("title"), 
                    (User) session.getAttribute("User"),
                    request.getParameter("description")
            );

            new TopicDAO().insert(t);
            
            List<Topic> listTopics = new TopicDAO().recovery();
            request.setAttribute("Topics", listTopics);
            
            request.getRequestDispatcher("topics.jsp").forward(request, response);
        } else {
            System.out.println("Tópico não cadastrado!!!");
        }

    }

}
