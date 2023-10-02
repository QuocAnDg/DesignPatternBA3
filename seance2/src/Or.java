import java.util.ArrayList;

public class Or implements Condition{
  ComparatorStrategy[] strategies;
  public Or(ComparatorStrategy... strategies){
    this.strategies = strategies;
  }
  @Override
  public boolean cmpCondition(String s) {
    int n = strategies.length -1;
    boolean ok = true;
    for (int i = 0; i < n; i++) {
      ok = strategies[i].imprimerSi(s) || strategies[i+1].imprimerSi(s);
      if (!ok){
        return ok;
      }
    }
    return ok;
  }

}
