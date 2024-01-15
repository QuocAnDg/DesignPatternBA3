public class Not {
  Strategy strategy;


  public Not(Strategy strategy) {
    this.strategy = strategy;

  }
  public boolean imprimerSi(String mot){
    return !strategy.imprimerSi(mot);
  }
}
