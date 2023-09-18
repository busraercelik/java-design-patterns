package dp.creational.factory.simple_factory_ex;

public class CandyStore {
  public static void main(String[] args) {
    CandyFactory candyFactory = new CandyFactory();
    candyFactory.getCandyPackage("chocolate candy", 2);
    candyFactory.getCandyPackage("hard candy", 5);
  }
}
