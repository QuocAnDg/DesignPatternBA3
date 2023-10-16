import java.util.HashMap;
import java.util.Map;

public class Magasin {
  private Map<String, Product> bac= new HashMap<String, Product>();
  private AbstractFactory abstractFactory;
  public Magasin(AbstractFactory abstractFactory){
    this.abstractFactory = abstractFactory;
  }
  public void ajouterProduct(String name, int anneeDeParution){
    Product product = abstractFactory.createProduct(name, anneeDeParution);
    bac.put(name, product);
  }
  public Product retourneProduct(String name){
    return bac.get(name);
  }
}
