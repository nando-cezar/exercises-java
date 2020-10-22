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

        if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.ANEL))){
            return String.valueOf(WordBaseData.RING);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.HOMEM))){
            return String.valueOf(WordBaseData.MAN);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.MULHER))){
            return String.valueOf(WordBaseData.WOMAN);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.VIAGEM))){
            return String.valueOf(WordBaseData.TRIP);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.DINHEIRO))){
            return String.valueOf(WordBaseData.MONEY);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.ESTUDO))){
            return String.valueOf(WordBaseData.STUDY);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.DEUS))){
            return String.valueOf(WordBaseData.GOD);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.MUSICA))){
            return String.valueOf(WordBaseData.MUSIC);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.COMPUTADOR))){
            return String.valueOf(WordBaseData.COMPUTER);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.FAMILIA))){
            return String.valueOf(WordBaseData.FAMILY);
        }
        return null;
    }
}
