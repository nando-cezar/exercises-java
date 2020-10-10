
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 * @param <E>
 */
public class Cesta<E> {
    
    List<E> lista = new ArrayList<>();
    
    public void adiciona(E elemento){
        lista.add(elemento);
    }
    
    public E retira(){
        Random r = new Random(System.currentTimeMillis());
        return lista.remove(r.nextInt(lista.size()));
    }
    
    public boolean temItens(){
        return !lista.isEmpty();
    }
    
    public void adicionaTodos(Collection<? extends E> elementos){
        elementos.forEach(e -> {
            adiciona(e);
        });
    }
}
