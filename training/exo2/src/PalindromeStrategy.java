public class PalindromeStrategy implements Strategy {

  @Override
  public boolean imprimerSi(String mot) {
    return estPalindrome(mot);
  }
  private boolean estPalindrome(String mot) {
    if (mot == null)
      return false;
    StringBuffer stringbuffer = new StringBuffer(mot);
    return mot.equals(stringbuffer.reverse().toString());
  }
}
