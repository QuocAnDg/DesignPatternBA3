public class PasAssezState extends State{

  @Override
  public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
    machineACafe.setMontantEnCours(machineACafe.getMontantEnCours() + piece.getValeur());
    machineACafe.afficherMontant();
    if (machineACafe.getBoisson().getPrix() > machineACafe.getMontantEnCours()) {
      machineACafe.afficherPasAssez(machineACafe.getBoisson());
    }
    else{
      machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()-machineACafe.getBoisson().getPrix());
      machineACafe.afficherBoisson(machineACafe.getBoisson());
      machineACafe.setBoisson(null);
      machineACafe.afficherMontant();
      if (machineACafe.getMontantEnCours() == 0){
        machineACafe.setState(new InactifState());
      }
      else{
        machineACafe.setState(new CollecteState());
      }
    }

  }
  public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson){throw new IllegalStateException();  }
}
