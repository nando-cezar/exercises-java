/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstrato;


public abstract class Poligono {

    public float area, perimetro, volume;
    
        public abstract void calcularArea();
        public abstract void calcularPerimetro();
        public abstract void calcularVolume();

}
