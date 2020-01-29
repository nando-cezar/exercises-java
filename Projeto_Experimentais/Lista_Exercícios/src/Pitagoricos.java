
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
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
public class Pitagoricos {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Informe primeiro valor: ");
        int a = tec.nextInt();
        System.out.println("Informe segundo valor: ");
        int b = tec.nextInt();
        System.out.println("Informe terceiro valor: ");
        int c = tec.nextInt();

        if(c ==sqrt(pow(a,2)+pow(b,2))){
            System.out.println("Numeros pitagoricos");
        }else{
            System.out.println("Numero invalido");
        }
        

    }
}
