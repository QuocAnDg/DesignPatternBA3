public class LongueurStrategy implements ComparatorStrategy{
  private int longueur;
  public LongueurStrategy(int longueur){
    this.longueur = longueur;
  }
  @Override
  public boolean imprimerSi(String s) {
    return s.length() == longueur;
  }
}
