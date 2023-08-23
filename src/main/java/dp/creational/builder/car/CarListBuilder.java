package dp.creational.builder.car;

import java.util.ArrayList;

public class CarListBuilder {
    ArrayList<Car> cars;

    public CarListBuilder addList() {
        this.cars = new ArrayList<>();
        return this;
    }

    public CarListBuilder addCar(Car car) {
        this.cars.add(car);
        return this;
    }

    public CarBuilder addCar() {
        return new MercedesCarBuilder(this);
    }

    public ArrayList<Car> buildList() {
        return cars;
    }
}
