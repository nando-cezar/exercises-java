/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.servlet;

import br.ba.coursera.bean.Comment;
import br.ba.coursera.bean.User;
import br.ba.coursera.dao.CommentDAO;
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
@WebServlet(urlPatterns = {"/registerComment"})
public class RegisterCommentServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        HttpSession session = request.getSession();  
        
        if (request.getParameter("description") != null) {

            Comment c = new Comment(
                    (User) session.getAttribute("User"),
                    request.getParameter("description")
            );

            new CommentDAO().insert(c);
            
            List<Comment> listComments = new CommentDAO().recovery();
            request.setAttribute("Comments", listComments);
            
            request.getRequestDispatcher("comments.jsp").forward(request, response);
        } else {
            System.out.println("Comentário não cadastrado!!!");
        }

    }

}
