public class CanonDamageUpgrade implements Robot {
    private Robot decoratedRobot;
    private int canonMultiplier;

    public CanonDamageUpgrade(Robot robot, int canonMultiplier) {
      this.decoratedRobot = robot;
      this.canonMultiplier = canonMultiplier;
    }

  @Override
  public int getCanon() {
    return decoratedRobot.getCanon() * canonMultiplier;
  }
  @Override
  public int getShield() {
    return decoratedRobot.getShield();
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

