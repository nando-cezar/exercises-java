/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.oraculomvc.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class Oraculo {
    
    
    public List<String> getGoodProducts(String type){
        
        List<String> list = new ArrayList<>();
        
        if(type.equals("doce de leite")){
            list.add("doce 1");
            list.add("doce 2");
        }else if(type.equals("queijo")){
            list.add("queijo 1");
            list.add("queijo 2");
            list.add("queijo 3");
        }       
        return list;
    }
}
