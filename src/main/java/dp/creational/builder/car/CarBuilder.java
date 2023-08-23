package dp.creational.builder.car;

public interface CarBuilder {
    CarBuilder setEngine(String engine);
    CarBuilder setColor(String color);
    CarBuilder setWheals(int wheals);
    CarBuilder setSeats(int seats);
    Car createCar();
    CarListBuilder addCarToList();
}
