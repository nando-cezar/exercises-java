
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
public class Cart {
    
    private final List<Product> listProduct;

    public Cart(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }
    
    public void giveDiscount(int percent, Condition<Product> c){
        for(Product p: listProduct){
            if(c.include(p)){
                p.setValue(p.getValue()*(100-percent)/100);
            }
        }
    }
    
}
