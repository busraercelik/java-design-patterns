package dp.structural.adapter.simple_adapter_ex;


import org.example.UKCarPriceCalculator;

public class Main {
  public static void main(String[] args) {
    CarPriceCalculator carPriceCalculator = new CarPriceCalculator("Ford", 3);
    printVehicle(carPriceCalculator);

    TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(10, 0);
    printVehicle(truckPriceCalculator);

    UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator("BMW", 7);
    PriceCalculatorAdapter adapter = new PriceCalculatorAdapter(ukCarPriceCalculator);
    printVehicle(adapter);
  }

  private static void printVehicle(PriceCalculator priceCalculator) {
    String price = priceCalculator.calculatePrice();
    System.out.println("The price of the vehicle " + price);
  }
}
