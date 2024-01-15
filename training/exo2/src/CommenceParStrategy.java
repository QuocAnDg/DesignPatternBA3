public class CommenceParStrategy implements Strategy {
  private char lettre;

  public CommenceParStrategy(char lettre) {
    this.lettre = lettre;
  }

  @Override
  public boolean imprimerSi(String mot) {
    return mot.charAt(0) == lettre;
  }
}
