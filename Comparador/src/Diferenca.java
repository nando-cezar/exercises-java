/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class Diferenca {
    
    private String propriedade;
    private Object valorNovo;
    private Object valorVelho;

    public Diferenca() {
    }

    public Diferenca(String propriedade, Object valorNovo, Object valorVelho) {
        this.propriedade = propriedade;
        this.valorNovo = valorNovo;
        this.valorVelho = valorVelho;
    }

    @Override
    public String toString() {
        return "Diferenca{" + "propriedade=" + propriedade + ", valorNovo=" + valorNovo + ", valorVelho=" + valorVelho + '}';
    }
    
}
