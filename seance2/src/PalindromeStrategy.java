public class PalindromeStrategy implements ComparatorStrategy{
  @Override
  public boolean imprimerSi(String s) {
    return estPalindrome(s);
  }
  private boolean estPalindrome(String mot) {
    if (mot == null)
      return false;
    StringBuffer stringbuffer = new StringBuffer(mot);
    return mot.equals(stringbuffer.reverse().toString());
  }
}
