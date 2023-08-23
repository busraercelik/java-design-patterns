package dp.structural.adapter.simple_adapter_ex;

public class CarPriceCalculator implements PriceCalculator{
  private int age;
  private String model;
  public final int averageCarPrice = 6000;

  public CarPriceCalculator(String model, int age) {
    this.model = model;
    this.age = age;
  }

  public int getRetailPrice() {
    return switch (model) {
      case "Ford" -> 3000;
      case "Audi" -> 5000;
      case "BMW" -> 7000;
      case "Tesla" -> 9000;
      default -> averageCarPrice;
    };
  }


  @Override
  public String calculatePrice() {
    int price = Math.max(getRetailPrice() - (age * 100), 0);
    return price + " USD";
  }
}
