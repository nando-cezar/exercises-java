/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class Tradutor {
    
    private String value;
    
    public String getTranslationValue(String value){
        
        this.value = value;

        if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.ANEL))){
            return "Ring";
        }
        return null;
    }
}
