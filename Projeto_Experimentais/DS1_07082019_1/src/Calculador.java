
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TREINAMENTO
 */
public class Calculador {
    public static void main(String[] args) {
        CalculadoraCientifica hp = new CalculadoraCientifica();
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o primeiro termo:");
        float v1 = tec.nextInt();
        System.out.println("Informe o segundo termo:");
        float v2 = tec.nextInt();
        System.out.println("Informe o operador:");
        char op = tec.next().charAt(0);
        float res;
        switch(op){
            case '+':res=hp.somar(v1, v2);System.out.println("Resultado:"+res);break;
            case '-':res=hp.subtrair(v1, v2);System.out.println("Resultado:"+res);break;
            case '*':res=hp.multiplicar(v1, v2);System.out.println("Resultado:"+res);break;
            case '/':res=hp.dividir(v1, v2);System.out.println("Resultado:"+res);break;
            default:System.out.println("Operador Invalido!");
        }
    }
}
