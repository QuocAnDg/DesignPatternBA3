public class Main {

  public static void main(String[] args) {
    MagasinDeDVD magasinDeDVD = new MagasinDeDVD();
    String dvd1 = "dvd1";
    String dvd2 = "dvd2";
    int anneeDeParution = 2015;
    magasinDeDVD.ajouterDVD(dvd1, anneeDeParution);
    magasinDeDVD.ajouterDVD(dvd1, anneeDeParution);
    magasinDeDVD.retournerDVD(dvd1);
    magasinDeDVD.retournerDVD(dvd2);

    String livre1 = "livre1";
    String livre2 = "livre2";
    MagasinDeLivre magasinDeLivre = new MagasinDeLivre();
    magasinDeLivre.ajouterLivre(livre1, anneeDeParution);
    magasinDeLivre.ajouterLivre(livre2, anneeDeParution);
    magasinDeLivre.retournerLivre(livre1);
    magasinDeLivre.retournerLivre(livre2);
  }
}