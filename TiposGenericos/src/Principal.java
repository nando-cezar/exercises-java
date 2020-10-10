
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Principal {
    
    public static void main(String[] args) {
        /* Instanciando objeto Cesta para o elemento da classe Fruta */ 
        Cesta<Fruta> frutas = new Cesta<>();
        /* 
        Adicionando elemento Fruta 
        Obs.: O metódo adiciona, recebe tipo distintos de elementos por parâmetro 
        */
        frutas.adiciona(new Fruta("Maça"));
        frutas.adiciona(new Fruta("Banana"));
        frutas.adiciona(new Fruta("Uva"));
        frutas.adiciona(new Fruta("Pera"));
        
        /* Adicionando elemento FrutaVermelha */
        frutas.adiciona(new FrutaVermelha("Morango"));
        
        /* Instanciando um objeto List da classe FrutaVermelha */
        List<FrutaVermelha> frutasVermelhas = new ArrayList<>();
        /* 
        Adicionando elementos a lista de frutas vermelhas
        Obs.: A classe FrutaVermelha extende da classe Fruta, 
        sendo assim a classe FrutaVermelha também recebe elementos por parâmetro 
        */
        frutasVermelhas.add(new FrutaVermelha("Amora"));
        frutasVermelhas.add(new FrutaVermelha("Cereja"));
        
        /* 
        No método adicionarTodos vai reunir todos Elementos, sendo Fruta ou FrutaVermelhas 
        */
        frutas.adicionaTodos(frutasVermelhas);
        
        /* Na repetição abaixo enquanto tiver itens na Cesta de Fruta, vai ser retirado */
        while(frutas.temItens()){
            System.out.println(frutas.retira());
        }
    }
    
}
