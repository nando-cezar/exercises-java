/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Windows
 */

@ManagedBean(name = "idenBean")
@SessionScoped

public class Identificar implements Serializable{
    
    private double valor1;
    private String res;

    public Identificar() {
    }

    public Identificar(double valor1, String res) {
        this.valor1 = valor1;
        this.res = res;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    
    private double auxiliar = 0;
    private double controller = 0;
    
    public void calcular(){
        for (double i = 1; i <= valor1; i++) {            
            auxiliar = valor1%i;
            if(auxiliar == 0){
                controller++;
                if(controller == 2){
                    res = "Primo";
                }else{
                    res = "Invalido";
                }
            }
        }
    }
}
