/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class UsandoString {
    public static void main(String[] args) {
        java.lang.String nome = "Cimatec";
        java.lang.String letra = "B";
        System.out.println("Lenght:"+nome.length());         
        System.out.println("charArt:"+nome.charAt(2));
        System.out.println("sibstring: "+nome.substring(0));
        System.out.println("substring: "+nome.substring(0, 6));
        System.out.println("indexOf: "+nome.indexOf("t"));
        System.out.println("lastIndexOf: "+nome.lastIndexOf("c"));
        System.out.println("toUpperCase: "+nome.toUpperCase());
        System.out.println("toLowerCase: "+nome.toLowerCase());
        System.out.println(nome);
        System.out.println("Concat: "+nome.concat("A melhor"));
        System.out.println("Replace: "+nome.replace('a','@'));
        System.out.println("Trim: "+nome.trim());
        System.out.println("Compare: "+letra.compareTo("A"));//Compara letra atraves de um metodo aritmetico pra retornar um valor inteiro;

    }
}
