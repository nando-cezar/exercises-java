
package br.ba.senai.util;


public class Cavalo {
    
    protected int alimentacao = 50;
    private String nome;

    
    public Cavalo(String nome){
        this.nome = nome;
    }
    
    public void cavalgar(){ // Criando operação cavalgar;
        
        /* Implementando operação*/
        if(alimentacao>=30){
            System.out.println("Cavalgando");
            alimentacao --;
        }else{
            System.out.println("Me alimente!");
        }
    }    
    public void comer(){
        
        if(alimentacao<100){
            alimentacao++;
        }else{
            System.out.println("Estou abastecido!");
        }
    }
}
