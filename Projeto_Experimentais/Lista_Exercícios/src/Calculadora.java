
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
public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Informe primeiro termo: ");
        float v1 = tec.nextFloat();
        System.out.println("Informe segundo termo: ");
        float v2 = tec.nextFloat();
        System.out.println("Informe operação: ");
        char op = tec.next().charAt(0);
        
        float resultado;
        
        switch(op){
            case '+': 
                resultado = v1 + v2;
                System.out.println(resultado);
                break;
            case '-': 
                resultado = v1 - v2;
                System.out.println(resultado);
                break;
            case '/': 
                resultado = v1 / v2;
                System.out.println(resultado);
                break;
            case '*': 
                resultado = v1 * v2;
                System.out.println(resultado);
                break;
        }
    }
}
