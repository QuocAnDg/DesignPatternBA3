public abstract class State {
  public void entrerMonnaie(Piece piece, MachineACafe machineACafe){
    machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()+piece.getValeur());
    machineACafe.afficherMontant();
    machineACafe.setEtatCourant(new CollectState());
  }
  public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe){
    if (toucheBoisson.getPrix() > machineACafe.getMontantEnCours()) {
      machineACafe.setBoisson(toucheBoisson);

      machineACafe.afficherPasAssez(machineACafe.getBoisson());
      machineACafe.setBoisson(toucheBoisson);
      machineACafe.setEtatCourant(new NotEnoughState());
      return;
    }
    machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()-toucheBoisson.getPrix());

    machineACafe.afficherBoisson(toucheBoisson);
    machineACafe.afficherMontant();
    if ( machineACafe.getMontantEnCours() == 0)
      machineACafe.setEtatCourant(new IdleState());

    else
      machineACafe.setEtatCourant(new CollectState());

  }
  public void rendreMonnaie(MachineACafe machineACafe){
    machineACafe.afficherRetour();
    machineACafe.setMontantEnCours(0);
    machineACafe.setBoisson(null);
    machineACafe.setEtatCourant(new IdleState());

  }


}
