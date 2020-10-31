/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.dao;

import br.ba.coursera.bean.User;
import java.util.List;

/**
 *
 * @author Windows
 */
public interface InterfaceUserDAO {
   
   //insere um novo usuário no banco de dados
   public void insert(User u);
   
   //recupera o usuário pelo seu login
   public User recovery(String login);
   
   //adiciona os pontos para o usuário no banco
   public void addPoints(String login, int points);
   
   //retorna a lista de usuários ordenada por pontos (maior primeiro)
   public List<User> ranking();

}
