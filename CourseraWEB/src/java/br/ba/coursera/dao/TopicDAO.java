/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.dao;

import br.ba.coursera.bean.Topic;
import br.ba.coursera.bean.Topic;
import br.ba.coursera.bean.User;
import br.ba.coursera.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class TopicDAO implements InterfaceTopicDAO {

    @Override
    public void insert(Topic t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Topic> recovery() {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Topic> topics = new ArrayList<>();

        try {

            stmt = conn.prepareStatement("SELECT * FROM topico");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Topic t = new Topic();
                t.setId(rs.getInt("id"));
                t.setTitle(rs.getString("titulo"));
//                User u = new User();
//                u.setId(rs.getInt("usuario_id"));
//                u.setName(rs.getString("nome"));
                //t.setUser(u);
                t.setDescription(rs.getString("descricao"));

                topics.add(t);
            }

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        
        return topics;
    }

    @Override
    public Topic recoveryTopic(Topic t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
