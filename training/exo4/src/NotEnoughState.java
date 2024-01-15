public class NotEnoughState  extends State{

  @Override
  public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe) {
    throw new IllegalStateException();
  }
  public void entrerMonnaie(Piece piece, MachineACafe machineACafe){
    machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()+piece.getValeur());
    machineACafe.afficherMontant();
    if (machineACafe.getBoisson().getPrix() > machineACafe.getMontantEnCours()) {
      machineACafe.afficherPasAssez(machineACafe.getBoisson());
    } else {
      machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()-machineACafe.getBoisson().getPrix());
      machineACafe.afficherBoisson(machineACafe.getBoisson());
      machineACafe.setBoisson(null);
      machineACafe.afficherMontant();
      if (machineACafe.getMontantEnCours() == 0)
        machineACafe.setEtatCourant(new IdleState());
      else
        machineACafe.setEtatCourant(new CollectState());
    }
  }

}
