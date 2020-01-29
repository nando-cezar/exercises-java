/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.bean;

/**
 *
 * @author aluno
 */

// Exemplo sobrecarga

public class Mensagem {
    public static void mostrarMensagem(){
        System.out.println("Boa noite");
    }
    public static void mostrarMensagem(String msg){
        System.out.println(msg);
    }
    public static void mostrarMensagem(String msg1, String msg2){
        System.out.println(msg1+msg2);
    }
    public static void mostrarMensagem(int numero){
        System.out.println("Numero:"+numero);
    }
    
}
