
package Aplicação;
import Operações.Quadrado;
import Operações.Triangulo;
import java.util.Scanner;


public class Programa{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        
        System.out.print("Informe base: ");
        float v1 = input.nextFloat();
        System.out.print("Informe altura: ");
        float v2 = input.nextFloat();
        System.out.print("Informe profundidade: ");
        float v3 = input.nextFloat();
        System.out.printf("\n(1.Quadrado | 2. Triangulo)\nInforme qual figura geometrica: ");
        int op = input.nextInt();
        
        System.out.printf("\n");
        
        switch(op){
            case 1:
                quadrado.base   = v1;
                quadrado.altura = v2;
                quadrado.profundidade = v3;
        
                quadrado.calcularArea();
                quadrado.calcularPerimetro();
                quadrado.calcularVolume();
                break;
                
             case 2:
                triangulo.base   = v1;
                triangulo.altura = v2;
                triangulo.profundidade = v3;
        
                triangulo.calcularArea();
                triangulo.calcularPerimetro();
                triangulo.calcularVolume();
                break;
        }
       
        

    }
}
