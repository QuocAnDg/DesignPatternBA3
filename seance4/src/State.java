public abstract class State {
  public void entrerMonnaie(MachineACafe machineACafe, Piece piece){
      machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()+ piece.getValeur());
      machineACafe.afficherMontant();
      machineACafe.setState(new CollecteState());




  }
  public  void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson){
    if (toucheBoisson.getPrix() > machineACafe.getMontantEnCours()) {
      machineACafe.setBoisson(toucheBoisson);
      machineACafe.afficherPasAssez(machineACafe.getBoisson());
      machineACafe.setBoisson(toucheBoisson);
      machineACafe.setState(new PasAssezState());
      return;
    }
    machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()- toucheBoisson.getPrix());
    machineACafe.afficherBoisson(toucheBoisson);
    machineACafe.afficherMontant();
    if (machineACafe.getMontantEnCours() == 0)
      machineACafe.setState(new InactifState());
    else
      machineACafe.setState(new CollecteState());
  }
  public void rendreMonnaie(MachineACafe machineACafe){
    machineACafe.afficherRetour();
    machineACafe.setBoisson(null);
    machineACafe.setMontantEnCours(0);
    machineACafe.setState(new InactifState());
  }
}
