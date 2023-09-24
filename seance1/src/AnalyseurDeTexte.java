import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// 1) Stratégie
// 2)
public class 	AnalyseurDeTexte {
	public static List<Observer> observerCollection = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		Observer belgiqueObserver = new BelgiqueObserver();
		Observer ligneObserver = new LigneObserver();
		Observer motObserver = new MotObserver();
		Observer palindromeObserver = new PalindromeObserver();
		registerObserver(belgiqueObserver);
		registerObserver(ligneObserver);
		registerObserver(motObserver);
		registerObserver(palindromeObserver);
		int nbrMots = 0, nbrLignes = 0, nbrPalindromes = 0, nbrBelgique = 0;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			notifyObserver(ligne);
		}
		lecteurAvecBuffer.close();
		System.out.println("Il y avait " + ligneObserver.getNbObserver() + " lignes.");
		System.out.println("Il y avait " + belgiqueObserver.getNbObserver() + " mots.");
		System.out.println("Il y avait " + motObserver.getNbObserver() + " palindromes.");
		System.out.println("Il y avait " + palindromeObserver.getNbObserver() + " lignes contenant Belgique.");
	}
	public static void registerObserver (Observer observer){
		observerCollection.add(observer);
	}
	public static void notifyObserver(String s){
		for (Observer observer1 : observerCollection) {
			observer1.traiterLigne(s);
		}
	}
}


