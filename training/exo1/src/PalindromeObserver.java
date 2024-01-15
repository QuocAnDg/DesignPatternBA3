public class PalindromeObserver implements Observer{
  private int nbPalindromes;
  @Override
  public void traiterLigne(String ligne) {
    for(String mot:ligne.trim().split(" ")) {
      StringBuffer temp=new StringBuffer(mot);
      if (mot.equals(temp.reverse().toString())) {
        nbPalindromes++;
      }
    }
  }

  @Override
  public void finFichier() {
    System.out.println("Il y avait " + nbPalindromes  + " palindromes.");
  }
}
