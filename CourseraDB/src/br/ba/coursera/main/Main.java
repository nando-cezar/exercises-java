/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.main;

import br.ba.coursera.bean.User;
import br.ba.coursera.dao.UserDAO;

/**
 *
 * @author Windows
 */
public class Main {
    
    public static void main(String[] args) throws Exception {

        User u = new User();
        u.setLogin("Jeferson123");
        u.setName("Jeferson");
        u.setEmail("jeferson@teste.com.br");
        u.setPassword("7894");
        u.setPoints(5);
        new UserDAO().insert(u);
        
        System.out.println(new UserDAO().recovery("Fernando123"));
        
        new UserDAO().addPoints("Fernando123", 7);
        
        System.out.println(new UserDAO().ranking());
    }
    
}
