/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.dao;

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
public class CommentDAO implements InterfaceTopicDAO {

    @Override
    public void insert(Topic t) {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            String sql = "INSERT INTO comentario (usuario_id, descricao) values (?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(2, t.getUser().getId());
            stmt.setString(3, t.getDescription());

            stmt.executeUpdate();

            System.out.println("Method Insert: Cadastrado com sucesso!!!");

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    @Override
    public List<Topic> recovery() {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Topic> comments = new ArrayList<>();

        try {

            stmt = conn.prepareStatement("SELECT * FROM comentario INNER JOIN usuario ON usuario.id = comentario.usuario_id");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Topic t = new Topic();
                t.setId(rs.getInt("id"));
                User u = new User();
                u.setId(rs.getInt("usuario_id"));
                u.setName(rs.getString("nome"));
                t.setUser(u);
                t.setDescription(rs.getString("descricao"));

                comments.add(t);
            }

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        
        return comments;
    }

    @Override
    public Topic recoveryTopic(Topic t) {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Topic comment = new Topic();

        try {

            stmt = conn.prepareStatement("SELECT * FROM usuario WHERE id = ?");
            stmt.setInt(1, t.getId());
            rs = stmt.executeQuery();

            if (rs.next()) {

                comment.setId(rs.getInt("id"));
                User u = new User();
                u.setId(rs.getInt("usuario_id"));
                u.setName(rs.getString("nome"));
                comment.setUser(u);
                comment.setDescription(rs.getString("descricao"));

                System.out.println("Method recovery: Consulta realizada com sucesso!");

            }

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        return comment;
    } 

}
