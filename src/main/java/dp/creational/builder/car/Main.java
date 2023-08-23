package dp.creational.builder.car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new MercedesCarBuilder();
        CarDirector carDirector = new CarDirector();
        Car mercedes = carDirector.constructCar(carBuilder);
        System.out.println(mercedes);

        ArrayList<Car> cars = new CarListBuilder().addList()
                .addCar().setColor("black").addCarToList()
                .addCar().setColor("white").addCarToList()
                .buildList();
        System.out.println(cars);
    }
}
