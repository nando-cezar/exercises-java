

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
public class VerificacaoNum {
    
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        float array[] = new float[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Informe primeiro valor: ");
            array[i] = tec.nextFloat();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println("Positivo: " + array[i]);
            } else if (array[i] == 0) {
                System.out.println("Zero: " + array[i]);
            } else if (array[i] < 0) {
                System.out.println("Negativo: " + array[i]);
            }
        }
    }
}
