
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
public class Fumante {
    public static void main(String[] args) {
        
        int anos, qtd_cigarro;
        float preco;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Informe quantidade de anos: ");
        anos = tec.nextInt();
        System.out.println("Informe quantidade de cigarro por dia: ");
        qtd_cigarro = tec.nextInt();
        System.out.println("Informe preço: ");
        preco = tec.nextFloat();
        
        float gasto_total = (((qtd_cigarro * preco)*30)*12)*anos;
        
        System.out.println("Gosto total: "+gasto_total);
        
    }
}
