public class RobotImpl implements Robot{
  private String name;
  private int ptsVie = 100;
  private int canon = 1;
  private int shield = 1;
  private int freq = 100;

  public RobotImpl(RobotBuilder builder) {
    this.name = builder.name;
    this.ptsVie = builder.ptsVie;
    this.canon = builder.canon;
    this.shield = builder.shield;
    this.freq = builder.freq;
  }

  @Override
  public int getCanon() {
    return canon;
  }

  @Override
  public int getShield() {
    return shield;
  }

  @Override
  public int getFreq() {
    return freq;
  }

  @Override
  public String getName() {
    return name;
  }

  public int getPtsVie() {
    return ptsVie;
  }

  @Override
  public int diffLife(int i) {
    if (i < 0) {
      // Si le paramètre est négatif, le robot perd de la vie.
      ptsVie += i;
    } else if (i > 0) {
      // Si le paramètre est positif, le robot est soigné.
      int maxHealth = 100; // Mettez la valeur maximale de points de vie ici
      ptsVie = Math.min(maxHealth, ptsVie + i);
    }
    // Si le paramètre est zéro, la méthode agit comme un getter sur les points de vie.
    return ptsVie;
  }
  public static class RobotBuilder{
    private String name;

    private int ptsVie = 100;
    private int canon = 1;
    private int shield = 1;

    private int freq = 100;
    public RobotBuilder(String name){
      this.name  = name;
    }
    public RobotBuilder ptsVie(int ptsVie){
      this.ptsVie = ptsVie;
      return this;
    }
    public RobotBuilder canon(int canon){
      this.canon = canon;
      return this;
    }
    public RobotBuilder shield(int shield){
      this.canon = canon;
      return this;
    }
    public RobotBuilder freq(int freq){
      this.freq = freq;
      return this;
    }

    public RobotImpl build(){
      return new RobotImpl(this);
    }
  }
}
