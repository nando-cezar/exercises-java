
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class UsandoMapas {
    public static void main(String[] args) {
        Map<String,Aluno> mapa = new HashMap<String,Aluno>();
        Scanner tec = new Scanner(System.in);

        System.out.println("Informe nome: ");
        String nome = tec.next();
        System.out.println("Informe idade: ");
        int idade = tec.nextInt();

        Aluno a = new Aluno(nome, idade);
        for (int i = 0; i < 2; i++) {

            mapa.put(String.valueOf(i), a);
        }

        Collection<Aluno> alunos = mapa.values();
        for (Aluno al : alunos) {
            System.out.println("Nome: " + al.getNome());
            System.out.println("Idade: " + al.getIdade());
        }
//        for (int i = 0; i < lista.size(); i++) {
//            Aluno a = lista.get(i);
//
//            System.out.println("Nome: " + a.getNome());
//            System.out.println("Idade: " + a.getIdade());
//
//        }
    }
}
