/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.bean;

/**
 *
 * @author Windows
 */
public class User {
    
    private int id;
    private String login;
    private String email;
    private String name;
    private String password;
    private int points;

    public User(String login, String email, String name, String password, int points) {
        this.login = login;
        this.email = email;
        this.name = name;
        this.password = password;
        this.points = points;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", email=" + email + ", name=" + name + ", points=" + points + '}';
    }
            
}
