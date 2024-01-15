public class LigneObserver implements Observer{
  private int nbLignes;
  @Override
  public void traiterLigne(String ligne) {
    nbLignes++;
  }

  @Override
  public void finFichier() {
    System.out.println("Il y avait " + nbLignes + " lignes.");
  }
}
