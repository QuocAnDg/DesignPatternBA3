public class Not implements Condition {
  ComparatorStrategy strategy;
  public Not(ComparatorStrategy strategy){
    this.strategy = strategy;
  }
  @Override
  public boolean cmpCondition(String s) {
    return !strategy.imprimerSi(s);
  }
}
