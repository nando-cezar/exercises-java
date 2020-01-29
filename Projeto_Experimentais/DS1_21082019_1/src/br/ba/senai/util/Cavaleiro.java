
package br.ba.senai.util;

public class Cavaleiro {
    
    private Cavalo cavalo; // Instanciando objeto cavalo a Classe Cavalo
    
    public Cavaleiro (String nome){
        cavalo = new Cavalo(nome);
    }
    
    public void ordenar(){ // Metodo ordenar, permite ter acesso ao metodo cavalgar na classe Cavalo.
        cavalo.cavalgar(); 
    }
    
    public void alimentar(){ //
        cavalo.comer();
    }
}
