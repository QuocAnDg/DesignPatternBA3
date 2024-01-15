package validation;

import domaine.CarteDeCredit;
import domaine.Discover;
import java.util.Calendar;

public class DiscoverGenerateur extends Generateur{

  public DiscoverGenerateur(Generateur successeur) {
    super(successeur);
  }

  @Override
  public boolean valider(String numero) {
    return (numero.startsWith("6011") || numero.startsWith("65")) && numero.length() == 16;
  }

  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom){
    if(this.valider(numero)){
      return new Discover(numero,dateExpiration,nom);
    }
    else return super.creerCarte(numero,dateExpiration,nom);
  }
}
