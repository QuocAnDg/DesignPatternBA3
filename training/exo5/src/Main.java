public class Main {

  public static void main(String[] args) {
    Album lonerism = new Album.AlbumBuilder("Lonerism",
        "Tame Impala").paysArtiste("Australie").anneeDeParution(2012).genre("indie rock").build();
    Album orange = new Album.AlbumBuilder("channel ORANGE",
        "Frank Ocean").anneeDeParution(2012).genre("R&B").build();
    Album visions = new Album.AlbumBuilder("Visions",
        "Grimes").anneeDeParution(2012).label("4AD").genre("Electronic").build();

    System.out.println(lonerism.getAnneeDeParution());
  }
}