/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TREINAMENTO
 */
public class Pessoa {
    String nome;
    private char sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo=='M' || sexo=='F' || sexo=='I')
           this.sexo = sexo;
        else
            System.out.println("Sexo Invalido");
    }
    
    
}
