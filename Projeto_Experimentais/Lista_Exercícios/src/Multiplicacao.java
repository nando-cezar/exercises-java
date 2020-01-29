
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
public class Multiplicacao {
    public static void main(String[] args) {
         int i, j, aux;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Informe valor 1: ");
        i = tec.nextInt();
        System.out.println("Informe valor 2: ");
        j = tec.nextInt();
        
        aux = i*j;
        
        System.out.println("Resultado: "+aux);
    }
}
