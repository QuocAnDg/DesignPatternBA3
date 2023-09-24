public class BelgiqueObserver implements Observer{
  private int nbBelgique = 0;

  @Override
  public void traiterLigne(String s) {
    if (s.contains("Belgique")){
      setNbBelgique(nbBelgique++);
    }
  }
  public void setNbBelgique(int nbBelgique) {
    this.nbBelgique = nbBelgique;
  }

  public int getNbBelgique() {
    return nbBelgique;
  }
}
