
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
public class EstCondEncadeada { // É quando tem uma estrutura condicional dentro da outra;  

    public static void main(String[] args) {

        int codigo;

        Scanner tec = new Scanner(System.in);
        System.out.println("Informe valor: ");
        codigo = tec.nextInt();
        /*EXEMPLO 1*/
        /*
         if(codigo >= 1){
         if(codigo <= 10){
         System.out.println("Entre 1 e 10!!!");
         }
         }
         }
         */
        /*EXEMPLO 2*/
        switch (codigo) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Valor invalido");
        }
    }
}
