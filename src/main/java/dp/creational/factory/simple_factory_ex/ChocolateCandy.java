package dp.creational.factory.simple_factory_ex;

import java.util.ArrayList;
import java.util.List;

public class ChocolateCandy extends Candy {
  @Override
  List<Candy> makeCandyPackage(int quantity) {
    ArrayList<Candy> chocolateCandies = new ArrayList<>();
    for (int i = 0; i < quantity; i++) {
      ChocolateCandy chocolateCandy = new ChocolateCandy();
      chocolateCandies.add(chocolateCandy);
    }
    System.out.println("One package of " + quantity + " chocolate candies has been made");
    return chocolateCandies;
  }
}
