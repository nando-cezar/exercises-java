
package Operações;
import Abstrato.Poligono;
import javax.swing.JOptionPane;

public class Quadrado extends Poligono{
    
    public float altura,  base, profundidade;
    
    @Override
    public void calcularArea() {
        this.area = base*altura;
        /*System.out.println("Resultado Area: " + area);*/
        
    }
//////////////////////////////////////////////////////////////
    @Override
    public void calcularPerimetro() {
        this.perimetro = base*4;
        /*System.out.println("Resultado Perimetro: " + perimetro);*/
       
    }
//////////////////////////////////////////////////////////////
    @Override
    public void calcularVolume() {
        this.volume = base*altura*profundidade;
        /*System.out.println("Resultado Volume: " + volume);*/
        
        // ---------------------------------------------------------------
        String resposta  = "Resultado Area: " + area + "\n" + "Resultado Perimetro: " + perimetro + "\n" + "Resultado Volume: " + volume;
        JOptionPane.showMessageDialog(null, resposta);
        // ---------------------------------------------------------------
    }

}
