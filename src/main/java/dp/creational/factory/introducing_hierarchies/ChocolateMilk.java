package dp.creational.factory.introducing_hierarchies;


import java.util.ArrayList;
import java.util.List;

public class ChocolateMilk extends Candy {
  @Override
  List<Candy> makeCandyPackage(int quantity) {
    ArrayList<Candy> chocolateCandies = new ArrayList<>();
    for (int i = 0; i < quantity; i++) {
      ChocolateMilk chocolateCandy = new ChocolateMilk();
      chocolateCandies.add(chocolateCandy);
    }
    System.out.println("One package of " + quantity + " milk chocolate has been made");
    return chocolateCandies;
  }
}
