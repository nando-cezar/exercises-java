/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Principal {
    
    public static void main(String[] args) {
    
        Cesta<Fruta> frutas = new Cesta<>();
        frutas.adiciona(new Fruta("Maça"));
        frutas.adiciona(new Fruta("Banana"));
        frutas.adiciona(new Fruta("Uva"));
        frutas.adiciona(new Fruta("Pera"));
        frutas.adiciona(new FrutaVermelha("Morango"));
        while(frutas.temItens()){
            System.out.println(frutas.retira());
        }
    }
    
}
