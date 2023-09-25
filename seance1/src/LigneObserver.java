public class LigneObserver implements Observer{
  private int nbLigne = 0;
  @Override
  public void traiterLigne(String s) {
    nbLigne++;
  }
  @Override
  public void finFichier() {
    System.out.println("Il y avait " + nbLigne + " lignes.");
  }
}
