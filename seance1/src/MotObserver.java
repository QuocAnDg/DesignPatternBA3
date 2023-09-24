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

  @Override
  public int getNbObserver() {
    return nbMots;
  }
}
