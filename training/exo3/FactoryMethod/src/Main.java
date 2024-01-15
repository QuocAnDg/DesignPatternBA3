public class Main {

  public static void main(String[] args) {
    Magasin magasinDeDVD = new MagasinDeDVD();
    magasinDeDVD.ajouterProduit("socola baby", 2002);
    magasinDeDVD.ajouterProduit("whitey baby", 2003);
    System.out.println(magasinDeDVD.retourneProduit("socola baby"));

    Magasin magasinDeLivre = new MagasinDeLivre();

    magasinDeLivre.ajouterProduit("Daniel Negreanu, small ball", 1987);
    magasinDeLivre.ajouterProduit("Poker, WINIMAX", 1993);
    System.out.println(magasinDeLivre.retourneProduit("Daniel Negreanu, small ball"));

  }
}