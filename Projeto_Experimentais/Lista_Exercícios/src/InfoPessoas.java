
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
public class InfoPessoas {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        float altura;
        int sexo, aux=1;
        int n = 1;
                
        float matriz[][] = new float [2][n];
        
        while (aux > 0) {
            
            n++;
            System.out.println("Informe altura: ");
            altura = tec.nextFloat();
            matriz[0][n] = altura;
            System.out.print(" 1-Masculino | 2-Feminino\nInforme sexo: \n");
            sexo = tec.nextInt();
            matriz[1][n] = altura;
            
            System.out.print(" 1-Sim | 0-Não\nDeseja continuar: \n");
            aux = tec.nextInt();
            
        }
        System.out.println("sair");
    }
}
