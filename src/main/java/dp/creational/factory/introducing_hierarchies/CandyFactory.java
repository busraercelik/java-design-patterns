package dp.creational.factory.introducing_hierarchies;

import java.util.List;

public class CandyFactory {
  public Candy getCandy(String type) {
    return switch (type) {
      case "dark" -> new ChocolateDark();
      case "white" -> new ChocolateWhite();
      case "milk" -> new ChocolateMilk();
      case "candy_cane" -> new HardCandyCane();
      case "lollipop" -> new HardCandyLollipop();
      case "peppermint" -> new HardCandyPeppermint();
      default -> new ChocolateMilk();
    };
  }

  public List<Candy> getCandyPackage(String type, int quantity, String section) {
    Candy candy = getCandy(type);
    if (section.equals("hard candy") && (quantity % 10 != 0)) {
      System.out.println("Hard candy must be packaged in multiples of 10.");
      return null;
    }
    return candy.makeCandyPackage(quantity);
  }
}
