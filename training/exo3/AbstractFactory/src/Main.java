public class Main {

  public static void main(String[] args) {
    Magasin magasinDeDVD = new Magasin();
    magasinDeDVD.ajouterProduit("socola baby", 2002, new ConcreteDVDFactory());
    magasinDeDVD.ajouterProduit("whitey baby", 2003, new ConcreteDVDFactory());
    System.out.println(magasinDeDVD.retourneProduit("socola baby"));

    Magasin magasinDeLivre = new Magasin();

    magasinDeLivre.ajouterProduit("Daniel Negreanu, small ball", 1987, new ConcreteLivreFactory());
    magasinDeLivre.ajouterProduit("Poker, WINIMAX", 1993, new ConcreteLivreFactory());
    System.out.println(magasinDeLivre.retourneProduit("Daniel Negreanu, small ball"));
  }
}