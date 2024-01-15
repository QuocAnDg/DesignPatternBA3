public class MotsObserver implements Observer{
  private int nbMots = 0;
  @Override
  public void traiterLigne(String ligne) {
    String[] mots = ligne.trim().split(" ");
    this.nbMots+= mots.length;
  }

  @Override
  public void finFichier() {
    System.out.println("Il y avait " + nbMots + " mots.");
  }

}
