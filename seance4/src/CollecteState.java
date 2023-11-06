public class CollecteState extends State{

  @Override
  public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
    machineACafe.setState(new CollecteState());
  }
}
