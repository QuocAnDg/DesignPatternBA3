public class RobotImpl implements Robot {
  private int ptsVie;
  private int canon;
  private int shield;
  private int freq;
  private String name;

  public RobotImpl(Builder builder) {
    this.ptsVie = builder.ptsVie;
    this.canon = builder.canon;
    this.shield = builder.shield;
    this.freq = builder.freq;
    this.name = builder.name;
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
  public int getPtsVie() {
    return ptsVie;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setPtsVie(int ptsVie) {
    this.ptsVie = ptsVie;
  }

  @Override
  public void setCanon(int canon) {
    this.canon = canon;
  }

  @Override
  public void setShield(int shield) {
    this.shield = shield;
  }

  @Override
  public void setFreq(int freq) {
    this.freq = freq;
  }

  @Override
  public int diffLife(int i) {
    return this.ptsVie += i;
  }

  @Override
  public Robot clone() {

    try {
      return (Robot)super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

  public static class Builder{
    private final String name;
    private int ptsVie;
    private int canon;
    private int shield;
    private int freq;


    public Builder(String name) {
      this.ptsVie = 100;
      this.canon = 1;
      this.shield = 1;
      this.freq = 1;
      this.name = name;
    }
    public Builder ptsVie(int vie){
      this.ptsVie = vie;
      return this;
    }
    public Builder canon(int canon){
      this.canon = canon;
      return this;
    }
    public Builder shield(int shield){
      this.shield = shield;
      return this;
    }
    public Builder freq(int freq){
      this.freq = freq;
      return this;
    }
    public Robot build(){
      return new RobotImpl(this);
    }

  }
}
