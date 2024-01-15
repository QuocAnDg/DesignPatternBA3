public class Album {
  private String titre;
  private String nomArtiste;
  private String label;
  private String producteur;
  private String paysArtiste;
  private String version;


  private String genre;
  private int anneeDeParution;
  private boolean isMasterised;
  private boolean IsOriginalAnneeDeParution;
  private double debitQualiteStandard;
  private double debitQualiteAbonnee;

  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public String getNomArtiste() {
    return nomArtiste;
  }

  public void setNomArtiste(String nomArtiste) {
    this.nomArtiste = nomArtiste;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getProducteur() {
    return producteur;
  }

  public void setProducteur(String producteur) {
    this.producteur = producteur;
  }

  public String getPaysArtiste() {
    return paysArtiste;
  }

  public void setPaysArtiste(String paysArtiste) {
    this.paysArtiste = paysArtiste;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getAnneeDeParution() {
    return anneeDeParution;
  }

  public void setAnneeDeParution(int anneeDeParution) {
    this.anneeDeParution = anneeDeParution;
  }

  public boolean isMasterised() {
    return isMasterised;
  }

  public void setMasterised(boolean masterised) {
    isMasterised = masterised;
  }

  public boolean isOriginalAnneeDeParution() {
    return IsOriginalAnneeDeParution;
  }

  public void setOriginalAnneeDeParution(boolean originalAnneeDeParution) {
    IsOriginalAnneeDeParution = originalAnneeDeParution;
  }

  public double getDebitQualiteStandard() {
    return debitQualiteStandard;
  }

  public void setDebitQualiteStandard(double debitQualiteStandard) {
    this.debitQualiteStandard = debitQualiteStandard;
  }

  public double getDebitQualiteAbonnee() {
    return debitQualiteAbonnee;
  }

  public void setDebitQualiteAbonnee(double debitQualiteAbonnee) {
    this.debitQualiteAbonnee = debitQualiteAbonnee;
  }

  public Album(AlbumBuilder builder) {
    this.titre = builder.titre;
    this.nomArtiste = builder.nomArtiste;
    this.label = builder.label;
    this.producteur = builder.producteur;
    this.paysArtiste = builder.paysArtiste;
    this.version = builder.version;
    this.genre = builder.genre;
    this.anneeDeParution = builder.anneeDeParution;
    this.isMasterised = builder.isMasterised;
    IsOriginalAnneeDeParution = builder.IsOriginalAnneeDeParution;
    this.debitQualiteStandard = builder.debitQualiteStandard;
    this.debitQualiteAbonnee = builder.debitQualiteAbonnee;

  }

  public static class AlbumBuilder{
    private String titre;
    private String nomArtiste;
    private String label;
    private String producteur;
    private String paysArtiste;
    private String version;
    private String genre;
    private int anneeDeParution;
    private boolean isMasterised;
    private boolean IsOriginalAnneeDeParution;
    private double debitQualiteStandard;
    private double debitQualiteAbonnee;

    public AlbumBuilder(String titre, String nomArtiste) {
      this.titre = titre;
      this.nomArtiste = nomArtiste;
    }
    public AlbumBuilder label(String label){
      this.label = label;
      return this;
    }
    public AlbumBuilder producteur(String producteur){
      this.producteur = producteur;
      return this;
    } public AlbumBuilder paysArtiste(String paysArtiste){
      this.paysArtiste = paysArtiste;
      return this;
    } public AlbumBuilder version(String version){
      this.version = version;
      return this;
    } public AlbumBuilder genre(String genre){
      this.genre = genre;
      return this;
    }
    public AlbumBuilder anneeDeParution(int anneeDeParution){
      this.anneeDeParution = anneeDeParution;
      return this;
    }
    public AlbumBuilder isMasterised(boolean isMasterised){
      this.isMasterised = isMasterised;
      return this;
    }
    public AlbumBuilder IsOriginalAnneeDeParution(boolean IsOriginalAnneeDeParution){
      this.IsOriginalAnneeDeParution = IsOriginalAnneeDeParution;
      return this;
    }
    public AlbumBuilder debitQualiteStandard(double debitQualiteStandard){
      this.debitQualiteStandard = debitQualiteStandard;
      return this;
    }
    public AlbumBuilder debitQualiteAbonnee(double debitQualiteAbonnee){
      this.debitQualiteAbonnee = debitQualiteAbonnee;
      return this;
    }
    public Album build(){
      return new Album(this);
    }





  }
}

