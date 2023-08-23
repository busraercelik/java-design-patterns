package dp.structural.adapter.challenge;

public class WeatherWarnings {
  public static final double MAX_TEMPERATURE = 100;
  public static final double MIN_TEMPERATURE = 16;


  public void postWarning(City city) {
    if(city.getTemperature() >= MAX_TEMPERATURE || city.getTemperature() <= MIN_TEMPERATURE) {
      System.out.println("Warning! Current temperature in " +city.getName()
          + " is " + city.getTemperature() + " " + city.getTemperatureScale());
      city.setHasWeatherWarning(true);
    } else {
      System.out.println("Temperature in " + city.getName() + " is OK.");
    }
  }
}
