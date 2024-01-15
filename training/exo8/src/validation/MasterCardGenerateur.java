package validation;

import domaine.CarteDeCredit;
import domaine.MasterCard;
import java.util.Calendar;

public class MasterCardGenerateur extends Generateur {

  public MasterCardGenerateur(Generateur successeur) {
    super(successeur);
  }

  @Override
  public boolean valider(String numero) {
    return (numero.startsWith("51") ||
        numero.startsWith("52") ||
        numero.startsWith("53") ||
        numero.startsWith("54") ||
        numero.startsWith("55") && numero.length() == 16);
  }

  @Override
  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    if (valider(numero)){
      return new MasterCard(numero, dateExpiration, nom);
    }
    return super.creerCarte(numero, dateExpiration, nom);
  }
}
