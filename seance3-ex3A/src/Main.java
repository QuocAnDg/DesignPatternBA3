public class Main {

  public static void main(String[] args) {
    Magasin magasin1 = new Magasin(new DVDFactory());
    String dvd1 = "dvd1";
    String dvd2 = "dvd2";
    magasin1.ajouterProduct(dvd1, 2015);
    magasin1.ajouterProduct(dvd2, 2015);
    System.out.println(magasin1.retourneProduct(dvd1));
    System.out.println(magasin1.retourneProduct(dvd2));

    String livre1 = "livre1";
    String livre2 = "livre2";
    Magasin magasin2 = new Magasin(new LivreFactory());
    magasin2.ajouterProduct(livre1, 2015);
    magasin2.ajouterProduct(livre2, 2015);
    System.out.println(magasin2.retourneProduct(livre1));
    System.out.println(magasin2.retourneProduct(livre2));
  }
}