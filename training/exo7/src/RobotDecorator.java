public class RobotDecorator implements Robot {

  private Robot robot;
  private int bonusPtsVie;
  private int bonusCanon;
  private int bonusShield;
  private int bonusFreq;
  private String name;
  public RobotDecorator(Robot robot) {
    this.robot = robot;
  }

  @Override
  public int getCanon() {
    return robot.getCanon() * bonusCanon;
  }

  @Override
  public int getShield() {
    return robot.getShield() * bonusShield;
  }

  @Override
  public int getFreq() {
    return robot.getFreq() * bonusFreq;
  }

  @Override
  public int getPtsVie() {
    return robot.getPtsVie() * bonusPtsVie;
  }


  @Override
  public String getName() {
    return null;
  }

  @Override
  public void setPtsVie(int ptsVie) {
    this.bonusPtsVie = ptsVie;
  }

  @Override
  public void setCanon(int canon) {
    this.bonusCanon = canon;
  }

  @Override
  public void setShield(int shield) {
    this.bonusShield = shield;
  }

  @Override
  public void setFreq(int freq) {
    this.bonusFreq = freq;
  }

  @Override
  public int diffLife(int i) {
    // La logique ici dépend de la façon dont vous voulez gérer la différence de vie.
    // Vous pouvez ajuster la logique en fonction de vos besoins spécifiques.
    return robot.diffLife(i) ;
  }
}
