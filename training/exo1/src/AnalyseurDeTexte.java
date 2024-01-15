import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalyseurDeTexte {
	private List<Observer> observationColection;
	public AnalyseurDeTexte(){
		observationColection = new ArrayList<>();
	}
	public void registerObserver(Observer observer){
		observationColection.add(observer);
	}
	public void unregisterObserver(Observer observer){
		observationColection.remove(observer);
	}
	public void notifyObserver(String ligne){
		for (Observer observer : observationColection) {
			observer.traiterLigne(ligne);
		}
	}
	public void notifyObserver(){
		for (Observer observer : observationColection) {
			observer.finFichier();
		}
	}
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
		notifyObserver();
		lecteurAvecBuffer.close();
	}
}
