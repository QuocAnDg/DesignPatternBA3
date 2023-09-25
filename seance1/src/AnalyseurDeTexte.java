import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// 1) Stratégie
// 2)
public class AnalyseurDeTexte {
	public List<Observer> observerCollection = new ArrayList<>();
	public void lireFichier(String filename) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			notifyObserver(ligne);
		}
		lecteurAvecBuffer.close();
		for (Observer observer : observerCollection) {
			observer.finFichier();
		}
	}
	public void registerObserver (Observer observer){
		observerCollection.add(observer);
	}
	public void notifyObserver(String s){
		for (Observer observer : observerCollection) {
			observer.traiterLigne(s);
		}
	}
}

// lireFichier(String file) void


