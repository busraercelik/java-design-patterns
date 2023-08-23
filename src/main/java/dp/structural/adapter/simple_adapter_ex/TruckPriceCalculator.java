package dp.structural.adapter.simple_adapter_ex;

public class TruckPriceCalculator implements PriceCalculator{
  private int age;
  private int mileage;
  public final int averageCarPrice = 10_000;

  public TruckPriceCalculator(int age, int mileage) {
    this.age = age;
    this.mileage = mileage;
  }

  @Override
  public String calculatePrice() {
    int price = Math.max(averageCarPrice - age*100 - mileage/100, 0);
    return price + " USD";
  }
}
