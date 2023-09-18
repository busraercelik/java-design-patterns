package dp.creational.factory.simple_factory_ex;

import java.util.ArrayList;
import java.util.List;

public class HardCandy extends Candy {
  @Override
  List<Candy> makeCandyPackage(int quantity) {
    ArrayList<Candy> hardCandies = new ArrayList<>();
    for (int i = 0; i < quantity; i++) {
      HardCandy hardCandy = new HardCandy();
      hardCandies.add(hardCandy);
    }
    System.out.println("One package of " + quantity + " hard candies has been made");
    return hardCandies;
  }
}
