import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    AnalyseurDeTexte analyseurDeTexte = new AnalyseurDeTexte();
    Observer ligneObserver = new LigneObserver();
    Observer belgiqueObserver = new MotObserver("Belgique");
    Observer motsObserver = new MotsObserver();
    Observer palindromeObserver = new PalindromeObserver();

    analyseurDeTexte.registerObserver(ligneObserver);
    analyseurDeTexte.registerObserver(belgiqueObserver);
    analyseurDeTexte.registerObserver(motsObserver);
    analyseurDeTexte.registerObserver(palindromeObserver);

    analyseurDeTexte.lireFichier(args[0]);
  }
}