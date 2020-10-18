/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class Product {
    
    private String name;
    private int value;

    public Product(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public void giveDiscount(){
        this.value = value*90/100;
    }

    @Override
    public String toString() {
        return getName() + " - " + getValue();
    }
   
}
