
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class EstRepWhile {

    public static void main(String[] args) {
        int qtd = 0;
/*        
        int i = 1;
        while (i <= 10) {
            System.out.println("Numero: " + i);
            i++;
        }
*/        
        char cont;
        System.out.println("Deseja continuar? ");
        Scanner tec = new Scanner(System.in);
        cont = tec.next().charAt(0);//charAt determina qual posição vai ser capturada; 
  
        while (cont == 's' || cont == 'S') {
            qtd++;
            System.out.println("Desejo continuar?");
            cont = tec.next().charAt(0);
        }
        System.out.println("Quantidade de voltas: "+qtd);
    }
}
