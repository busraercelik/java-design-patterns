package dp.creational.factory.introducing_hierarchies;

import java.util.List;

public abstract class CandyFactory {
  public abstract Candy getCandy(String type);

  public List<Candy> getCandyPackage(String type, int quantity) {
    Candy candy = getCandy(type);
    return candy.makeCandyPackage(quantity);
  }
}
