/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.programa;

import br.ba.senai.bean.Professor;
import br.ba.senai.bean.Programador;
import br.ba.senai.bean.Trabalhador;

/**
 *
 * @author aluno
 */
public class Principal3 {
    public static void main(String[] args) {
        Trabalhador t1,t2,t3;
        t1 = new Trabalhador();
        t2 = new Professor();
        t3 = new Programador();
        
        t1.trabalhar();
        t2.trabalhar();
        t3.trabalhar();
    }
}
