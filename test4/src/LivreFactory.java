public class LivreFactory implements AbstractFactory{

  @Override
  public Produit createProduct(String name, int anneeDeParution) {
    return new Livre(name, anneeDeParution);
  }
}
