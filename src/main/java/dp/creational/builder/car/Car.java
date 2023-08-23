package dp.creational.builder.car;

public class Car {
    private String engine;
    private String color;
    private int wheals;
    private int seats;

    public Car(String engine, String color, int wheals, int seats) {
        this.engine = engine;
        this.color = color;
        this.wheals = wheals;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", wheals=" + wheals +
                ", seats=" + seats +
                '}';
    }
}
