public class IdleState extends State{

  @Override
  public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe) {
    machineACafe.afficherPasAssez(toucheBoisson);
    return;
  }
}
