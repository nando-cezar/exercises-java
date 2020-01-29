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
public class Professor extends Trabalhador{

    @Override
    public void trabalhar() {
        System.out.println("Ministrar Aulas");
    }
    
}
