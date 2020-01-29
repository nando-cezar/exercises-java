/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.programa;

import br.ba.senai.bean.Conta;
import br.ba.senai.bean.ContaEspecial;

/**
 *
 * @author aluno
 */
public class Principal2 {
    public static void main(String[] args) {
        Conta c1 = new Conta("123",50);
        c1.consultarSaldo();
        c1.depositar(100);
        c1.consultarSaldo();
        c1.sacar(23);
        c1.consultarSaldo();
        
        ContaEspecial c2 = new ContaEspecial(1000,"123",500);
        c2.consultarSaldo();
        c2.depositar(100);
        c2.consultarSaldo();
        c2.sacar(1600);
        c2.consultarSaldo();
    }
}
