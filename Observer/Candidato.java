

public class Candidato implements Observer{

  private String nome;

  public Candidato(String nome, Subject subject){
    this.nome = nome;
    subject.registerObserver(this);
  }
  @Override
  public void update(String text) {
    System.out.println(this.nome + " - Vaga de emprego: " + text);

  }
  
}
