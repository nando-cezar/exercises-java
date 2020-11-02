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
public class Topic {
    
    private int id;
    private String title;
    private User user;
    private String description;

    public Topic() {
    }

    public Topic(int id, String title, User user, String description) {
        this.id = id;
        this.title = title;
        this.user = user;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "Topic{" + "title=" + title + ", user=" + user + ", description=" + description + '}';
    }
    
    
}
