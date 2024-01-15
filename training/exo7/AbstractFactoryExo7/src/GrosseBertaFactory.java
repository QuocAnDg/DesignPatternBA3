public class GrosseBertaFactory implements AbstractFactory {

  @Override
  public Robot create() {
    Robot robot1 = new RobotDecorator(new RobotImpl.Builder("PicVert").canon(15).ptsVie(150).freq(30).build());

    return robot1;
  }
}
