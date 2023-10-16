public class LivreFactory implements AbstractFactory{
	@Override
	public Product createProduct(String name, int anneeParution) {
		return new Livre(name, anneeParution);
	}
}
