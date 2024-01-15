import java.util.HashMap;

public class PrototypeFlyweight {
  private HashMap<String, Robot> robots = new HashMap<>();

  public void put(String name, Robot robot){
    robots.put(name, robot);
  }
  public Robot create(String name){
    return robots.get(name).clone();
  }

}
