import java.util.ArrayList;
import java.util.List;

public class CompoundCond {
  private List<Condition> conditions = new ArrayList<>();

  public boolean cmpCondition(String s) {
    for (Condition condition : conditions) {
        if (!condition.cmpCondition(s)){
          return false;
        }
    }
    return true;
  }
  public void addCond(Condition condition){
    conditions.add(condition);
  }
}
