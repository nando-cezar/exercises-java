
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
public class Triangulo {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Informe primeiro valor: ");
        float a = tec.nextFloat();
        System.out.println("Informe segundo valor: ");
        float b = tec.nextFloat();
        System.out.println("Informe terceiro valor: ");
        float c = tec.nextFloat();

        if (a == b && b == c && c == a) {
            System.out.println("Triangulo Equilatero");

        } else if (a == b || a == c || b == c) {
            System.out.println("Triangulo Isosceles");

        } else if (a != b && b != c && c != a) {
            System.out.println("Triangulo Escaleno");

        }
    }
}
