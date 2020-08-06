/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Windows
 */
public class Triangle {
    
    public double a;
    public double b;
    public double c;
    
    public double getArea(){
        return Math.sqrt((this.a+this.b+this.c)/2.0 * ((this.a+this.b+this.c)/2.0-this.a) * ((this.a+this.b+this.c)/2.0-this.b) * ((this.a+this.b+this.c)/2.0-this.c));
    }
}
