/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class Dado6Lados implements IDado{
    
    int lado;
    
    @Override
    public void rolar() {
        this.lado = (int)Math.floor(Math.random()*6+1);
    }

    @Override
    public void mostrar() {
        System.out.println("1-6 " + this.lado);
    }
    
}
