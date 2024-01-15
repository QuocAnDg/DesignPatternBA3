public class DVDFactory implements AbstractFactory{

  @Override
  public Produit createProduct(String name, int anneeDeParution) {
    return new DVD(name, anneeDeParution);
  }
}
