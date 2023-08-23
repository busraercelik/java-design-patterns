package dp.structural.adapter.simple_adapter_ex;

import org.example.UKCarPriceCalculator;

public class PriceCalculatorAdapter implements PriceCalculator {

  UKCarPriceCalculator ukCarPriceCalculator;

  public PriceCalculatorAdapter(UKCarPriceCalculator ukCarPriceCalculator) {
    this.ukCarPriceCalculator = ukCarPriceCalculator;
  }

  @Override
  public String calculatePrice() {
      return ukCarPriceCalculator.getPrice() + " GBP";
  }
}
