public class LigneObserver implements Observer{
  private int nbLigne = 0;
  @Override
  public void traiterLigne(String s) {
    setNbLigne(nbLigne++);
  }
  public void setNbLigne(int nbLigne) {
    this.nbLigne = nbLigne;
  }

  public int getNbLigne() {
    return nbLigne;
  }
}