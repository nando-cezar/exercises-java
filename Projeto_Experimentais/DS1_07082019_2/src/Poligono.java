
public abstract class Poligono { //Classe abstrata pode ser utilizada sub-classes abstratas ou concretas.
                                 //Classe concreta pode ser utilizada somente sub-classes concretas.
    
    float area;
    int qtdLados;
    
    public abstract void calcularArea(); // A operação vai ser desenvolvida na classe;
    /*Recurso normalmente utilizado para momentos onde o programador tem muitas versões de um mesmo tipo de recurso.*/

    public int getQtdLados() {
        return qtdLados;
    }

    public void setQtdLados(int qtdLados) {
        this.qtdLados = qtdLados;
    }
    
    
}
