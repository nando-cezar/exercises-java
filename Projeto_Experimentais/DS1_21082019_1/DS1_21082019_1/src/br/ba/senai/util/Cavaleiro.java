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
public class Cavaleiro {
    private Cavalo cavalo;

    public Cavaleiro(String nome) {
        cavalo = new Cavalo(nome);
    }
    
    public void ordenar(){
        cavalo.cavalgar();
    }
    
    public void alimentar(){
        cavalo.comer();
    }
    
}
