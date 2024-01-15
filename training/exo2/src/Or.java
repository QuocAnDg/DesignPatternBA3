public class Or {
  Strategy strategy1;
  Strategy strategy2;

  public Or(Strategy strategy1, Strategy strategy2) {
    this.strategy1 = strategy1;
    this.strategy2 = strategy2;
  }
  public boolean imprimerSi(String mot){
    return strategy1.imprimerSi(mot) || strategy2.imprimerSi(mot);
  }
}
