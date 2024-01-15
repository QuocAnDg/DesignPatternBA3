public class ShieldPowerUpgrade implements Robot {
  private Robot decoratedRobot;
  private int shieldMultiplicateur;

  public ShieldPowerUpgrade(Robot robot, int shieldMultiplicateur) {
    this.decoratedRobot = robot;
    this.shieldMultiplicateur = shieldMultiplicateur;
  }

  @Override
  public int getCanon() {
    return decoratedRobot.getCanon();
  }

  @Override
  public int getShield() {
    return decoratedRobot.getShield() * 2;
  }

  @Override
  public int getFreq() {
    return decoratedRobot.getFreq();
  }

  @Override
  public String getName() {
    return decoratedRobot.getName();
  }

  @Override
  public int diffLife(int i) {
    return decoratedRobot.diffLife(i);
  }
}