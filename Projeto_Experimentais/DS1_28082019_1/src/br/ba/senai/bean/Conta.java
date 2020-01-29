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
public class Conta {
    protected String numeroConta;
    protected double saldo;
/////////////////////// Sobrecarga
    public Conta() {
    }

    public Conta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
  
    public void consultarSaldo(){
        System.out.println("Saldo:"+this.saldo);
    }
    
    public void depositar(double valor){
        this.saldo+=valor;
    }
    
    public void sacar(double valor){
        if (valor<=this.saldo)
            this.saldo-=valor;
        else
            System.out.println("Saldo Insuficiente");
    }
    ///////////////////////  
}
