package dp.structural.adapter.challenge;

public class Main {
  public static void main(String[] args) {
    WeatherWarnings weatherWarnings = new WeatherWarnings();

    NorthAmericanCity chicago = new NorthAmericanCity("Chicago", 16);
    weatherWarnings.postWarning(chicago);

    NorthAmericanCity phoenix = new NorthAmericanCity("Phoenix", 104);
    weatherWarnings.postWarning(phoenix);

    NorthAmericanCity portland = new NorthAmericanCity("Portland", 70);
    weatherWarnings.postWarning(portland);

    AsianCity bangkok = new AsianCity("Bangkok", 50);
    CityAdapter adapter = new CityAdapter(bangkok);
    weatherWarnings.postWarning(adapter);
  }
}

