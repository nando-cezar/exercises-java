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
    
    private double v1; 
    private double v2; 
    private char op; 
    private double res; 

    public Calculadora(double v1, double v2, char op) {
        this.v1 = v1;
        this.v2 = v2;
        this.op = op;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
    
    public void Calcular(){
        
        switch(op){
            case '+': res = v1 + v2; break;
            case '-': res = v1 - v2; break;
            case '*': res = v1 * v2; break;
            case '/': res = v1 / v2; break;
        }
    }
}
