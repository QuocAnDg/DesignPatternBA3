import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre extends Magasin {
	private Map<String,Livre> etagere= new HashMap<String,Livre>();
	public void ajouterLivre(String name, int anneeDeParution) {
		Livre livre = (Livre) createProduct(name, anneeDeParution);
		etagere.put(name, livre);
	}
	@Override
	protected Product createProduct(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
	public Livre retournerLivre(String name) {
		return etagere.get(name);
	}
}
