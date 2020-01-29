
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
public class UsandoList {

    public static void main(String[] args) {
        
        List<Aluno> lista = new ArrayList<Aluno>();
        Scanner tec = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Informe nome: ");
            String nome = tec.next();
            System.out.println("Informe idade: ");
            int idade = tec.nextInt();

            Aluno a = new Aluno(nome, idade);
            lista.add(a);
        }
//        for (int i = 0; i < lista.size(); i++) {
//            Aluno a = lista.get(i);
//
//            System.out.println("Nome: " + a.getNome());
//            System.out.println("Idade: " + a.getIdade());
//
//        }
//        for(Aluno o: lista){
//            System.out.println("Nome: " + o.getNome());
//            System.out.println("Idade: " + o.getIdade());
//        }
        for(Iterator i = lista.iterator();i.hasNext();){
            Aluno a = (Aluno)i.next();
            System.out.println("Nome: " + a.getNome());
            System.out.println("Idade: " + a.getIdade());
        }
    }
}
