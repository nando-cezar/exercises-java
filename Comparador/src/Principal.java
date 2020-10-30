
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class Principal {
    
    public static void main(String[] args) throws Exception {
        
        Pessoa p1 = new Pessoa("Fernando", "Cezar", 23);
        Pessoa p2 = new Pessoa("Fernando", "Cezar", 24);
        
        List<Diferenca> difs = Comparador.comparar(p1, p2);
        
        difs.forEach(System.out::println);
    }
}
