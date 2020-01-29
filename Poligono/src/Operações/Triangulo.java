
package Operações;
import Abstrato.Poligono;
import javax.swing.JOptionPane;


public class Triangulo extends Poligono{
        
    public float base, altura, profundidade;

    @Override
    public void calcularArea() {
        this.area = (base*altura)/2;
        //System.out.println("Resultado Area: " + area);
    }
/////////////////////////////////////////////////////////////////////////
    @Override
    public void calcularPerimetro() {
        this.perimetro = base*3;
        //System.out.println("Resultado Perimetro: " + perimetro);
    }
/////////////////////////////////////////////////////////////////////////
    @Override
    public void calcularVolume() {
        this.volume = (((base*altura)/2)*altura)/3;
        //System.out.println("Resultado Volume: " + volume);
        
        //----------------------------------------------------------------
         String resposta  = "Resultado Area: " + area + "\n" + "Resultado Perimetro: " + perimetro + "\n" + "Resultado Volume: " + volume;
         JOptionPane.showMessageDialog(null, resposta);
        //----------------------------------------------------------------
    }
   
}
