/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class TesteTerceiraThread {
    public static void main(String[] args) {
        MinhaTerceiraThread mtt = new MinhaTerceiraThread();       
        Thread t1 = new Thread(mtt);
        t1.start();
        while(t1.isAlive()){
            System.out.println("Estou na tela principal!");
        }       
    }
}
