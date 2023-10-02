public class createDVD  extends ConcreteProduct{
  public createDVD()
  }
  @Override
  protected Product create(String name, int anneeDeParution) {
    return new DVD(name, anneeDeParution);
  }
}
