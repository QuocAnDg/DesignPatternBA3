public class And implements Condition{
  private ComparatorStrategy strategy1;
  private ComparatorStrategy strategy2;

  public And(ComparatorStrategy strategy1, ComparatorStrategy strategy2){
    this.strategy1 = strategy1;
    this.strategy2 = strategy2;
  }
  @Override
  public boolean cmpCondition(String s) {
    return this.strategy1.imprimerSi(s) && this.strategy2.imprimerSi(s);
  }
}
