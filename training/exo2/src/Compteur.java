public class Compteur implements Strategy {
  private int compteur;
  private Strategy strategy;
  public Compteur(Strategy strategy) {
    this.strategy = strategy;
    this.compteur = 0;
  }
  @Override
  public boolean imprimerSi(String mot) {
    if (strategy.imprimerSi(mot)){
      compteur++;
    }
    return false;
  }
}
