public class TankFactory implements AbstractFactory{

  @Override
  public Robot create() {
    Robot robot1 = new RobotDecorator(new RobotImpl.Builder("Tank").canon(5).ptsVie(200).freq(50).shield(50).build());
    robot1.setShield(2);
    return robot1;
  }
}
