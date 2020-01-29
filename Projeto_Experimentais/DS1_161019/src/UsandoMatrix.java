
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
public class UsandoMatrix {

    public static void main(String[] args) {

        int num[][] = new int[3][];
        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Informe qtd. colunas: ");
            int nc = tec.nextInt();
            num[i] = new int[nc];
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 5);
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("Elemento(" + i + "," + j + "):" + num[i][j]);

            }
        }

    }
}
