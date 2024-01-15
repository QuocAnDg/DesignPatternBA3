package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class AmExGenerateur extends Generateur{

  public AmExGenerateur(Generateur successeur) {
    super(successeur);
  }

  @Override
  public boolean valider(String numero) {
    return numero.startsWith("34") || numero.startsWith("37") && numero.length() == 15;
  }

  @Override
  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    if (this.valider(numero)){
      return new AmEx(numero, dateExpiration, nom);
    }
    else return super.creerCarte(numero,dateExpiration,nom);
  }
}
