
package br.ba.senai.bean;

public class ContaEspecial extends Conta{
    protected double limite;
////////////////// Sobrecarga
    public ContaEspecial() {
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(double limite, String numeroConta, double saldo) {
        super(numeroConta, saldo);
        this.limite = limite;
    }
/////////////////////////////
    
    
////////////////// Sobreposição
    @Override
    public void sacar(double valor) {
        if (valor<=(this.saldo+this.limite))
            this.saldo-=valor;
        else
            System.out.println("Saldo Insuficiente");
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Limite :"+this.limite);
        System.out.println("Saldo+limite:"+(this.saldo+this.limite));
    }
    ////////////////////////////
    }
