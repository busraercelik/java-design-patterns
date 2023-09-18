package dp.creational.factory.introducing_hierarchies;


import java.util.ArrayList;
import java.util.List;

public class ChocolateWhite extends Candy {
  @Override
  List<Candy> makeCandyPackage(int quantity) {
    ArrayList<Candy> chocolateCandies = new ArrayList<>();
    for (int i = 0; i < quantity; i++) {
      ChocolateWhite chocolateCandy = new ChocolateWhite();
      chocolateCandies.add(chocolateCandy);
    }
    System.out.println("One package of " + quantity + " white chocolate has been made");
    return chocolateCandies;
  }
}
