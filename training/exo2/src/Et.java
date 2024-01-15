import java.util.List;

public class Et {
  List<Strategy> strategies;

  public Et(List<Strategy> strategies) {
    this.strategies = strategies;
  }
  public boolean imprimerSi(String mot){
    for (Strategy strategy : strategies) {
      if (!strategy.imprimerSi(mot)){
        return false;
      }
    }
    return true;
  }
}
