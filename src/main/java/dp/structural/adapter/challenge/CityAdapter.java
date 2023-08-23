package dp.structural.adapter.challenge;

public class CityAdapter implements City {
  private City city;

  public CityAdapter(City asianCity) {
    this.city = asianCity;
  }

  @Override
  public String getName() {
    return city.getName();
  }

  @Override
  public double getTemperature() {
    return (city.getTemperature() * 1.8) + 32;
  }

  @Override
  public String getTemperatureScale() {
    return city.getTemperatureScale();
  }

  @Override
  public boolean getHasWeatherWarning() {
    return city.getHasWeatherWarning();
  }

  @Override
  public void setHasWeatherWarning(boolean hasWeatherWarning) {
    city.setHasWeatherWarning(hasWeatherWarning);
  }
}
