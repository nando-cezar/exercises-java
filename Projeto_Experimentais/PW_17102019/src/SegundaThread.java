/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class SegundaThread {
    public static void main(String[] args) {
        MinhaThread thread1 = new MinhaThread();
        thread1.start();
        while(true){
            System.out.println("Minha segunda thread!!!");
        }
    }
}
