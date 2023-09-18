package dp.creational.factory.introducing_hierarchies;


import java.util.ArrayList;
import java.util.List;

public class ChocolateDark extends Candy {
  @Override
  List<Candy> makeCandyPackage(int quantity) {
    ArrayList<Candy> chocolateCandies = new ArrayList<>();
    for (int i = 0; i < quantity; i++) {
      ChocolateDark chocolateCandy = new ChocolateDark();
      chocolateCandies.add(chocolateCandy);
    }
    System.out.println("One package of " + quantity + " dark chocolate has been made");
    return chocolateCandies;
  }
}
