public class Main {

  public static void main(String[] args) {
    CompoundCond compoundCond = new CompoundCond();

    Condition and1 = new And(new CommencerParStrategy('t'), new LongueurStrategy(4));
    Condition not1 = new Not(new CommencerParStrategy('t'));

    compoundCond.addCond(and1);
    compoundCond.addCond(not1);


  }
}