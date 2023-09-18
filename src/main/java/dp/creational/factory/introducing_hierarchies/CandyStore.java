package dp.creational.factory.introducing_hierarchies;

public class CandyStore {
  private static final CandyFactory hardCandyFactory = new HardCandyFactory();
  private static final CandyFactory chocolateFactory = new ChocolateFactory();

  public static void main(String[] args) {
    hardCandyFactory.getCandyPackage("candy_cane", 10);
    chocolateFactory.getCandyPackage("white", 4);
    hardCandyFactory.getCandyPackage("lollipop", 20);
  }
}
