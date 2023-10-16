public class DVDFactory implements AbstractFactory{
	@Override
	public Product createProduct(String name, int anneeParution) {
		return new DVD(name, anneeParution);
	}
}
