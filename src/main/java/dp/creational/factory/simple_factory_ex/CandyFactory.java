package dp.creational.factory.simple_factory_ex;

import java.util.List;

public class CandyFactory {
  public Candy getCandy(String type) {
    return switch (type) {
      case "hard candy" -> new HardCandy();
      case "chocolate candy" -> new ChocolateCandy();
      default -> null;
    };
  }

  public List<Candy> getCandyPackage(String type, int quantity) {
    Candy candy = getCandy(type);
    return candy.makeCandyPackage(quantity);
  }
}
