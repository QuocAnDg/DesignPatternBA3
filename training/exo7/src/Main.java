public class Main {

  public static void main(String[] args) {
    // un robot avec un canon de 10, un bouclier de 2, une fréquence de tir de 100 et qui a reçu une amélioration
    // de canon multipliant la puissance de ce dernier par 2.
    Robot robot1 = new RobotImpl.Builder("robot1")
        .canon(10)
        .shield(2)
        .freq(100)
        .build();
    Robot robotDecorator1 = new RobotDecorator(robot1);
    robotDecorator1.setCanon(2);

    // un robot avec un canon de 9, un bouclier de 3, une fréquence de tir de 90
    // et qui a reçu une amélioration de bouclier multipliant ce dernier par 2 et une amélioration de mitigation
    // des dégats qui réduit les points de vue perdus par 2.
    Robot robot2 = new RobotImpl.Builder("robot1")
            .canon(9)
            .shield(3)
            .freq(90)
            .build();

    Robot robotDecorator2 = new RobotDecorator(robot2);
    robotDecorator2.setShield(2);

    System.out.println("Hello world!");
  }
}