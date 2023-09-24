public class PalindromeObserver implements Observer{
  private int nbrPalindromes = 0;
  @Override
  public void traiterLigne(String s) {
    String[] mots = s.trim().split(" ");
    for (String mot : mots) {
      StringBuffer temp = new StringBuffer(mot);
      if (mot.equals(temp.reverse().toString())) {
        setNbrPalindromes(nbrPalindromes++);
      }
    }
  }
  public void setNbrPalindromes(int nbrPalindromes) {
    this.nbrPalindromes = nbrPalindromes;
  }

  public int getNbrPalindromes() {
    return nbrPalindromes;
  }
}
