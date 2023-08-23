package dp.creational.builder.car;

public class MercedesCarBuilder implements CarBuilder{
    private String engine;
    private String color;
    private int wheals;
    private int seats;
    private CarListBuilder carListBuilder;

    public MercedesCarBuilder() {
    }

    public MercedesCarBuilder(CarListBuilder carListBuilder) {
        this.carListBuilder = carListBuilder;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder setWheals(int wheals) {
        this.wheals = wheals;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Car createCar() {
        return new Car(engine, color, wheals, seats);
    }

    @Override
    public CarListBuilder addCarToList() {
        Car car = createCar();
        this.carListBuilder.addCar(car);
        return this.carListBuilder;
    }
}
