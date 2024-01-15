package validation;

import domaine.CarteDeCredit;
import domaine.DinersClub;
import java.util.Calendar;

public class DinersClubGenerateur extends Generateur{

  public DinersClubGenerateur(Generateur successeur) {
    super(successeur);
  }

  @Override
  public boolean valider(String numero) {
    return numero.startsWith("36") && numero.length() == 15;
  }

  @Override
  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    if (this.valider(numero)){
      return new DinersClub(numero, dateExpiration, nom);
    }
    else return super.creerCarte(numero,dateExpiration,nom);
  }
}
