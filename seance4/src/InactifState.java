public class InactifState extends State{
  @Override
  public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
    machineACafe.afficherPasAssez(toucheBoisson);
    return;
  }


}
