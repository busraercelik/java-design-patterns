package dp.creational.factory.introducing_hierarchies;


import java.util.ArrayList;
import java.util.List;

public class HardCandyCane extends Candy {
  @Override
  List<Candy> makeCandyPackage(int quantity) {
    ArrayList<Candy> hardCandies = new ArrayList<>();
    for (int i = 0; i < quantity; i++) {
      HardCandyCane hardCandyLollipop = new HardCandyCane();
      hardCandies.add(hardCandyLollipop);
    }
    System.out.println("One package of " + quantity + " candy cane has been made");
    return hardCandies;
  }
}
