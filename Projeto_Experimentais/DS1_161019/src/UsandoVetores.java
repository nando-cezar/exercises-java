/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class UsandoVetores {
    public static void main(String[] args) {
        
        int num[];//Declaração vetor
        num = new int[5];//Construir vetor com 5 posições
        
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 5);            
        }
        
        for (int i = 0; i < num.length; i++) {
            if(num[i]>2){
                System.out.println(num[i]);
            }
            
        }
    }
}
