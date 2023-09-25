import java.io.*;
import java.util.*;

public class ListerMots { // mal foutu
	private String fichier;

	public ListerMots(String fichier) {
		this.fichier = fichier;
	}

	public void imprimerSi(ComparatorStrategy cmpStrategy) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(this.fichier));
		String buffer = null;
		while ((buffer = input.readLine()) != null) {
			StringTokenizer mots = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
			while (mots.hasMoreTokens()) {
				String mot = mots.nextToken();
				if (cmpStrategy.imprimerSi(mot))
					System.out.println(mot);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("Usage : java ListerMots fichier");
			System.exit(1);
		}
		new ListerMots(args[0]).imprimerSi(new CommencerParStrategy('t'));
		new ListerMots(args[0]).imprimerSi(new LongueurStrategy(8));
		new ListerMots(args[0]).imprimerSi(new PalindromeStrategy());
	}
}
