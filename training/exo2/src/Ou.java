import java.util.List;

public class Ou {
  List<Strategy> strategies;

  public Ou(List<Strategy> strategies) {
    this.strategies = strategies;
  }
  public boolean imprimerSi(String mot){
    for (Strategy strategy : strategies) {
      if (strategy.imprimerSi(mot)){
        return true;
      }
    }
    return false;
  }
}
