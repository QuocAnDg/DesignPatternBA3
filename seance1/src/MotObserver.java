public class MotObserver implements Observer{
  private int nbMots = 0;
  @Override
  public void traiterLigne(String s) {
    String[] mots = s.split(" ");
    setNbMots(mots.length);
  }

  public void setNbMots(int nbMots) {
    this.nbMots = nbMots;
  }

  public int getNbMots() {
    return nbMots;
  }
}
