/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.beans;

/**
 *
 * @author Windows
 */
public class Conversor {
    
    private double v1;
    private char   op;
    private double resultado;

    public Conversor(double v1, char op) {
        this.v1 = v1;
        this.op = op;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
    public void Converter (){
        
        switch(op){
            
            case 'k': resultado = v1 + 273; break;
            case 'f': resultado = (1.8*v1) + 32; break;

        }
        
    }
    
}
