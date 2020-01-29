/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.executavel;

import br.ba.senai.util.Cavaleiro;
import br.ba.senai.util.Cavalo;
import java.util.Scanner;

/**
 *
 * @author andre.portugal
 */
public class Programa {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        
        Cavaleiro c1 = new Cavaleiro("Silver");
        Cavaleiro c2 = new Cavaleiro("Golden");
        Cavaleiro c3 = new Cavaleiro("xxxxxx");
        for (int i = 1; i <= 22; i++) {
            c1.ordenar();
            
        }
    }
}
