public class SquareFactory implements AbstractFactory {

  @Override
  public Shape createShape(int i, Point point) {
    return new Square(i, point);
  }
}
