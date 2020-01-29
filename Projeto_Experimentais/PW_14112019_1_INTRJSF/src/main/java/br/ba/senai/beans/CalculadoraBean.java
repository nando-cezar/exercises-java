/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Windows
 */

@ManagedBean(name = "calcBean")
@SessionScoped
        
public class CalculadoraBean {
    
    private double valor1;
    private double valor2;
    private double res;
    private String op;

    public CalculadoraBean() {
    }

    public CalculadoraBean(double valor1, double valor2, double res, String op) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.res = res;
        this.op = op;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
    
    public void calcular(){
        switch(op.charAt(0)){
            case'+':res=valor1+valor2;break;
            case'-':res=valor1-valor2;break;
            case'*':res=valor1*valor2;break;
            case'/':res=valor1/valor2;break;
        }
    }
    
}
