import java.io.IOException;


public class Main {

  public static void main(String[] args) throws IOException {
    Observer belgiqueObserver = new BelgiqueObserver();
    Observer ligneObserver = new LigneObserver();
    Observer motObserver = new MotObserver();
    Observer palindromeObserver = new PalindromeObserver();
    AnalyseurDeTexte analyseurDeTexte = new AnalyseurDeTexte();
    analyseurDeTexte.registerObserver(belgiqueObserver);
    analyseurDeTexte.registerObserver(ligneObserver);
    analyseurDeTexte.registerObserver(motObserver);
    analyseurDeTexte.registerObserver(palindromeObserver);
    analyseurDeTexte.lireFichier(args[0]);
  }
}