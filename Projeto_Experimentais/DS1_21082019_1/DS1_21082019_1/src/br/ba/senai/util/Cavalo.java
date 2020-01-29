/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.util;

/**
 *
 * @author andre.portugal
 */
public class Cavalo {
    protected int alimentacao=50;
    private String nome;

    public Cavalo(String nome) {
        this.nome = nome;
    }
    
    
    
    public void cavalgar(){
        if (alimentacao>=30){
            System.out.println("Cavalgando");
            alimentacao--;
        }
        else
            System.out.println("Me alimente!");
    }
    
    public void comer(){
        if (alimentacao<100)
           alimentacao++;
        else
            System.out.println("Estou abastecido !!");
    }
}
