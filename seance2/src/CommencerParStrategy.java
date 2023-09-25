public class CommencerParStrategy implements ComparatorStrategy{
  private char lettre;
  public CommencerParStrategy(char lettre){
    this.lettre = lettre;
  }
  @Override
  public boolean imprimerSi(String s) {
    return s.charAt(0) == lettre;
  }
}
