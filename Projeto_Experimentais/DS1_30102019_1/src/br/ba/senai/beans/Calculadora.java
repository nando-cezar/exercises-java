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
public class Calculadora {
    
    public double somar(double v1, double v2){
        return (v1+v2);
    }
    public double subtrair(double v1, double v2){
        return (v1-v2);
    }
    public double multiplicar(double v1, double v2){
        return (v1*v2);
    }
    public int dividir(int v1, int v2) throws ArithmeticException{
        return (v1/v2);
    }
}
