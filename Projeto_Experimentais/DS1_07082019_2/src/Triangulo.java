/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class Triangulo extends Poligono{
    
    float base, altura;

    @Override
    public void calcularArea() {
        
        this.area = (base*altura)/2;
        
    }
   
}
