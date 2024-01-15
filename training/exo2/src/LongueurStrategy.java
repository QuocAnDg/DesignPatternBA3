public class LongueurStrategy implements Strategy {
  private int longueur;

  public LongueurStrategy(int longueur) {
    this.longueur = longueur;
  }

  @Override
  public boolean imprimerSi(String mot) {
    return mot.length() == longueur;

  }
}
