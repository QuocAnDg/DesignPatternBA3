public class PicVertFactory implements AbstractFactory{

  @Override
  public Robot create() {
    return new RobotDecorator(new RobotImpl.Builder("PicVert").canon(5).freq(160).shield(10).build());
  }
}
