public class Main {

  public static void main(String[] args) {
    CompoundCond compoundCond = new CompoundCond();

    // test 1
    Condition and1 = new And(new CommencerParStrategy('e'), new LongueurStrategy(3), new PalindromeStrategy());
    System.out.println(and1.cmpCondition("ete"));

    // test2
    Condition and3 = new And(new CommencerParStrategy('e'), new PalindromeStrategy());
    Condition and4 = new And(new LongueurStrategy(3));
    compoundCond.addCond(and3);
    compoundCond.addCond(and4);
    System.out.println(compoundCond.cmpCondition("ete"));

  }
}