/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.dao;

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
public class UserDAO implements InterfaceUserDAO {

    @Override
    public void insert(User u) {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            String sql = "INSERT INTO usuario (login, email, nome, senha, pontos) values (?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getName());
            stmt.setString(4, u.getPassword());
            stmt.setInt(5, u.getPoints());

            stmt.executeUpdate();

            System.out.println("Cadastrado com sucesso!!!");

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    @Override
    public User recovery(String login) {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        User u = new User();

        try {

            stmt = conn.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();

            if (rs.next()) {

                u.setLogin(rs.getString("login"));
                u.setEmail(rs.getString("email"));
                u.setName(rs.getString("nome"));
                u.setPassword(rs.getString("senha"));
                u.setPoints(rs.getInt("pontos"));

            }

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        return u;
    }

    @Override
    public void addPoints(String login, int points) {
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            String sql = "UPDATE usuario SET pontos = pontos + ? WHERE login = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, String.valueOf(points));
            stmt.setString(2, login);

            stmt.executeUpdate();

            System.out.println("Pontos adicionados com sucesso!!!");

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    @Override
    public List<User> ranking() {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<User> users = new ArrayList<>(); /*Lista usuarios vai armazenar valores que estão em ResultSet*/

        try {

            stmt = conn.prepareStatement("SELECT * FROM usuario ORDER BY pontos DESC");
            rs = stmt.executeQuery();

            while (rs.next()) {

                User u = new User();

                u.setLogin(rs.getString("login"));
                u.setEmail(rs.getString("email"));
                u.setName(rs.getString("nome"));
                u.setPassword(rs.getString("senha"));
                u.setPoints(rs.getInt("pontos"));

                users.add(u);

            }

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        return users;
    }

}
