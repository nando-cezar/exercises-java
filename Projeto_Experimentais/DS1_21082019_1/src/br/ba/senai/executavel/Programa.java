
package br.ba.senai.executavel;

import br.ba.senai.util.Cavaleiro;
import java.util.Scanner;
/**
 *
 * @author Windows
 */
public class Programa {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        Cavaleiro c1 = new Cavaleiro("Silver");
        
        for (int i = 1; i <= 22; i++) {
            c1.ordenar();      
        }
    }
}
