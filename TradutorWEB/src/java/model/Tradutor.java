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
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.AZUL))){
            return String.valueOf(WordBaseData.BLUE);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.VERMELHO))){
            return String.valueOf(WordBaseData.RED);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.AMARELO))){
            return String.valueOf(WordBaseData.YELLOW);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.ROSA))){
            return String.valueOf(WordBaseData.PINK);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.VERDE))){
            return String.valueOf(WordBaseData.GREEN);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.CACHORRO))){
            return String.valueOf(WordBaseData.DOG);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.GATO))){
            return String.valueOf(WordBaseData.CAT);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.PEIXE))){
            return String.valueOf(WordBaseData.FISH);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.MACACO))){
            return String.valueOf(WordBaseData.MONKEY);
        }else if(this.value.toUpperCase().equals(String.valueOf(WordBaseData.HUMANO))){
            return String.valueOf(WordBaseData.HUMAN);
        }
        return null;
    }
}
