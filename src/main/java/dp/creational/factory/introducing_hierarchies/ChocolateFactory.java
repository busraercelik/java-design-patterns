package dp.creational.factory.introducing_hierarchies;

import java.util.List;

public class ChocolateFactory extends CandyFactory {
  @Override
  public Candy getCandy(String type) {
    return switch (type) {
      case "dark" -> new ChocolateDark();
      case "white" -> new ChocolateWhite();
      default -> new ChocolateMilk();
    };
  }

  @Override
  public List<Candy> getCandyPackage(String type, int quantity) {
    Candy candy = getCandy(type);
    if (quantity % 10 != 0) {
      System.out.println("Hard candy must be packaged in multiples of 10.");
      return null;
    }
    return candy.makeCandyPackage(quantity);
  }

}
