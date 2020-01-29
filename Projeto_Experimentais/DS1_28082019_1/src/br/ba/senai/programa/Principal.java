/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.programa;

import br.ba.senai.bean.Mensagem;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        
        /*Exemplo Static*/
        Mensagem.mostrarMensagem();
        Mensagem.mostrarMensagem("Senai");
        Mensagem.mostrarMensagem("10");
        Mensagem.mostrarMensagem(10);
        
        
//        Mensagem msg = new Mensagem();
//        msg.mostrarMensagem();
//        msg.mostrarMensagem("Senai");
//        msg.mostrarMensagem("10");
//        msg.mostrarMensagem(10);
    }
}
