import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD {
	private Map<String, ConcreteProduct> bac= new HashMap<String, ConcreteProduct>();
	public void ajouterDVD(String name, int anneeDeParution){
		ConcreteProduct concreteProduct =new ConcreteProduct(name, anneeDeParution);
		bac.put(name, concreteProduct);
	}
	public ConcreteProduct retourneDVD(String name){
		return bac.get(name);
	}
}
