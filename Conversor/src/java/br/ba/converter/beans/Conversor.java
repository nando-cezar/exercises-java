/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.converter.beans;

/**
 *
 * @author Windows
 */
public class Conversor {
    
    private double value;
    private char   op;
    private double resultado;

    public Conversor(double value, char op) {
        this.value = value;
        this.op = op;
    }

    public double getV1() {
        return value;
    }

    public void setV1(double value) {
        this.value = value;
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
            case 'c': resultado = ((value - 32) * 5) / 9; break;
            case 'f': resultado = ((value * 9) / 5) + 32; break;

        }
        
    }
    
}
