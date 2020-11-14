/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.coursera.dao;

import br.ba.coursera.bean.Topic;
import java.util.List;

/**
 *
 * @author Windows
 */
public interface InterfaceCommentDAO {
   
   public void insert(Topic t);
   
   public List<Topic> recovery();
   
   public Topic recoveryTopic(Topic t);
}
