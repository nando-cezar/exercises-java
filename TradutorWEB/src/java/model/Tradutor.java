/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Windows
 */
public class Tradutor {
    
    private String value;
    
    public String getTranslationValue(String value){
        
        this.value = value;

        if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.RING))){
            return String.valueOf(WordBaseData.ANEL);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.MAN))){
            return String.valueOf(WordBaseData.HOMEM);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.WOMAN))){
            return String.valueOf(WordBaseData.MULHER);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.TRIP))){
            return String.valueOf(WordBaseData.VIAGEM);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.MONEY))){
            return String.valueOf(WordBaseData.DINHEIRO);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.STUDY))){
            return String.valueOf(WordBaseData.ESTUDO);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.GOD))){
            return String.valueOf(WordBaseData.DEUS);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.MUSIC))){
            return String.valueOf(WordBaseData.MUSICA);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.COMPUTER))){
            return String.valueOf(WordBaseData.COMPUTADOR);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.FAMILY))){
            return String.valueOf(WordBaseData.FAMILIA);
        }
        return null;
    }
}
