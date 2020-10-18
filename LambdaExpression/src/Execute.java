
import java.util.ArrayList;
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
public class Execute {
    
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("Tenis", 300));
        list.add(new Product("Camiseta", 80));
        list.add(new Product("Cinto", 50));
      
        list.forEach(System.out::println);
        System.out.println();
        
        //***********************
        Cart c = new Cart(list);  
        c.giveDiscount(20, p -> p.getValue() < 100);
        c.getListProduct().forEach(System.out::println);
        System.out.println();
        //***********************
        
        //list.forEach(p -> p.setValue(p.getValue()*90/100));
        //list.forEach(p -> p.giveDiscount());
        list.forEach(Product::giveDiscount);
        
        //list.forEach(p -> System.out.println(p));
        list.forEach(System.out::println);
        System.out.println();               
        
    }
}
