import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD extends  Magasin {
	private Map<String, DVD> bac= new HashMap<String,DVD>();

	protected void ajouterDVD(String name, int anneeDeParution) {

		DVD dvd= (DVD) createProduct(name, anneeDeParution);
		bac.put(name,dvd);
	}

	@Override
	protected Product createProduct(String name, int anneeDeParution) {
		return new DVD(name, anneeDeParution);
	}
	public DVD retournerDVD(String name) {
		return bac.get(name);
	}
}
