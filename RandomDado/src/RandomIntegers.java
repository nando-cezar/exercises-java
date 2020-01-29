
/* Lançamento de Dados*/

import java.util.Random;

public class RandomIntegers {
    
    public static void main(String[] args) {
        
        Random randomNumbers = new Random(); //instanciando objeto randomNumbers para classe Random;
        //(Gerador de numero aleatorio)
        
        int face; //Criando VARIAVEL tipo inteiro;
        
        for (int counter = 1; counter <= 20; counter++){ //loop de 20 vezes 
            
            face = 1 + randomNumbers.nextInt(6); // selecionar o inteiro aleatoerio de 1 a 6;
            /* 
            I. nextInt começa do '0' para isso somando mais um;
            II.nextInt (6), significa quê será limitado depois de 6 algarismos gerados;
            */
            System.out.printf("%d ", face);
            
            if(counter % 5 == 0){
                System.out.println();
            }
        }
    }
}
