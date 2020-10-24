import java.util.ArrayList;
import java.util.List;

public class HeadHunter implements Subject {

  private List<Observer> observadores;
  private List<String> oportunidades;
  
  public HeadHunter(){
    this.observadores = new ArrayList<>();
    this.oportunidades = new ArrayList<>();
  }

  public void receberOportunidade(String oportunidade){
    this.oportunidades.add(oportunidade);
    this.notifyAllObservers();
  }
  
  @Override
  public void registerObserver(Observer observer) {
    this.observadores.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    int ind = this.observadores.indexOf(observer);
    if(ind >= 0){
      this.observadores.remove(observer);
    }

  }

  @Override
  public void notifyAllObservers() {
    for (Observer observer : observadores) {
      observer.update(this.oportunidades.get(this.oportunidades.size()-1));
    }

  }
  
}
