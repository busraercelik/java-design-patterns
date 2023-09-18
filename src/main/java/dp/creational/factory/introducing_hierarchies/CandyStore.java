package dp.creational.factory.introducing_hierarchies;

public class CandyStore {
  private static final CandyFactory candyFactory = new CandyFactory();

  public static void main(String[] args) {
    candyFactory.getCandyPackage("candy_cane", 10, "hard candy");
    candyFactory.getCandyPackage("white", 4, "chocolate");
    candyFactory.getCandyPackage("lollipop", 20, "hard candy");
  }
}
