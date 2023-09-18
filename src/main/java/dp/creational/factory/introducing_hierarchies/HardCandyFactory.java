package dp.creational.factory.introducing_hierarchies;

public class HardCandyFactory extends CandyFactory{
  @Override
  public Candy getCandy(String type) {
    return switch (type) {
      case "lollipop" -> new HardCandyLollipop();
      case "peppermint" -> new HardCandyPeppermint();
      default -> new HardCandyCane();
    };
  }
}
