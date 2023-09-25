public class BelgiqueObserver implements Observer{
  private int nbBelgique = 0;
  private static final String BELGIQUE = "Belgique";
  @Override
  public void traiterLigne(String s) {
    String[] mots = s.trim().split(" ");
    for (int i = 0; i < mots.length; i++) {

      if (mots[i].equals(BELGIQUE)){
        nbBelgique++;
      }
    }
  }
  public void setNbBelgique(int nbBelgique) {
    this.nbBelgique = nbBelgique;
  }

  @Override
  public void finFichier() {
    System.out.println("Il y avait " + nbBelgique + " lignes contenant Belgique.");
  }
}
