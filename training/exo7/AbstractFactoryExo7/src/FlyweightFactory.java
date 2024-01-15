import java.util.HashMap;

public class FlyweightFactory {
  private HashMap<String, AbstractFactory> robots = new HashMap<>();

  public void put(String name, AbstractFactory factory){
    robots.put(name, factory);
  }
  public Robot create(String name){
    return robots.get(name).create();
  }

}
