public class MotObserver implements Observer{
  private int nbMots = 0;
  @Override
  public void traiterLigne(String s) {
    String[] mots = s.trim().split(" ");
    for (int i = 0; i < mots.length; i++) {
      nbMots++;
    }
  }

  @Override
  public void finFichier() {
    System.out.println("Il y avait " + nbMots + " mots.");
  }
}
