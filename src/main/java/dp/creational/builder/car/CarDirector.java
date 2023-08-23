package dp.creational.builder.car;

public class CarDirector {
    public Car constructCar(CarBuilder carBuilder) {
       return carBuilder.setEngine("V6")
               .setColor("Red")
               .setWheals(4)
               .setSeats(5)
               .createCar();
    }
}
