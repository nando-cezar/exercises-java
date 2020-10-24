
public class TesteObserver {
  public static void main(String[] args){

    HeadHunter headHunter = new HeadHunter();

    Observer candidato1 = new Candidato("Fernando", headHunter);

    headHunter.receberOportunidade("Analista");

    Observer candidato2 = new Candidato("Iris", headHunter);

    headHunter.receberOportunidade("Arquiteto");

    Observer candidato3 = new Candidato("Lucas", headHunter);
    headHunter.receberOportunidade("Engenheiro");
    
  }
}
