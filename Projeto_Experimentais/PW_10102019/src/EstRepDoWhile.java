
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
public class EstRepDoWhile {

    public static void main(String[] args) {
        int qtd = 0;
        char cont;

        Scanner tec = new Scanner(System.in);

        do {
            qtd++;
            System.out.println("Desejo continuar?");
            cont = tec.next().charAt(0);//charAt determina qual posição vai ser capturada; 
        } while (cont == 's' || cont == 'S');
        System.out.println("Quantidade de voltas: " + qtd);
    }
}
