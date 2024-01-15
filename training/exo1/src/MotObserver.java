public class MotObserver implements Observer{
  private String mot;
  private int nbMot = 0;
  public MotObserver(String mot){
    this.mot = mot;
  }
  @Override
  public void traiterLigne(String ligne) {
    if (ligne.contains(mot)){
      nbMot++;
    }
  }

  @Override
  public void finFichier() {
    System.out.println("Il y avait " + nbMot + " lignes contenant " + mot + ".");
  }
}
