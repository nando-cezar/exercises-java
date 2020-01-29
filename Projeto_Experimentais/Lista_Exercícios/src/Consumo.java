
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
public class Consumo {
    public static void main(String[] args) {
        
        float tempo, velocidade_media, distancia, consumo;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Informe o tempo: ");
        tempo = tec.nextFloat();
        System.out.println("Informe a veloocidade media: ");
        velocidade_media = tec.nextFloat();
        
        distancia = tempo * velocidade_media;
        
        consumo = distancia/12;
        
        System.out.println("Velocidade media: "+velocidade_media);
        System.out.println("Tempo gasto: "+tempo);
        System.out.println("Distancia: "+distancia);
        System.out.println("Consumo: "+consumo);
    }
}
