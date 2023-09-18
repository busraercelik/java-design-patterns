package dp.creational.factory.introducing_hierarchies;

import java.util.ArrayList;
import java.util.List;

public class HardCandyPeppermint extends Candy{
  @Override
  List<Candy> makeCandyPackage(int quantity) {
    ArrayList<Candy> hardCandies = new ArrayList<>();
    for (int i = 0; i < quantity; i++) {
      HardCandyLollipop hardCandyLollipop = new HardCandyLollipop();
      hardCandies.add(hardCandyLollipop);
    }
    System.out.println("One package of " + quantity + " peppermint candy has been made");
    return hardCandies;
  }
}
