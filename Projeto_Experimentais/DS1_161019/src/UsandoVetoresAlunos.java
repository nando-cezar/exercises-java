
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
public class UsandoVetoresAlunos {
    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[2];
        Scanner tec = new Scanner(System.in);
        
        for (int i = 0; i < alunos.length; i++) {
            
            System.out.println("Informe nome: ");
            String nome = tec.next();
            System.out.println("Informe idade: ");
            int idade = tec.nextInt();
            
            alunos[i] = new Aluno(nome,idade); 
        }
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("Idade: " + alunos[i].getIdade());
            
        }
    }
}
