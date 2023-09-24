public class BelgiqueObserver implements Observer{
  private int nbBelgique = 0;
  private static final String BELGIQUE = "Belgique";
  @Override
  public void traiterLigne(String s) {
    if (s.contains(BELGIQUE)){
      setNbBelgique(nbBelgique++);
    }
  }
  public void setNbBelgique(int nbBelgique) {
    this.nbBelgique = nbBelgique;
  }

  @Override
  public int getNbObserver() {
    return nbBelgique;
  }
}
