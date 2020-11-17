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
public class Comment {
    
    private int id;
    private User user;
    private String description;

    public Comment() {
    }

    public Comment(int id, User user, String description) {
        this.id = id;
        this.user = user;
        this.description = description;
    }
    
    public Comment(User user, String description) {
        this.user = user;
        this.description = description;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", user=" + user + ", description=" + description + '}';
    }
    
    
}
