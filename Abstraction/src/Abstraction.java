interface Transport {
    int speed();

    boolean wheels();
}

abstract class Vehicle implements Transport {
    protected boolean wheel;
    protected int numberOfSeat;

    Vehicle(boolean wheel, int numberOfSeat) {
        this.wheel = wheel;
        this.numberOfSeat = numberOfSeat;
    }
}

class Car extends Vehicle {
    private int maxSpeed;

    Car(boolean wheel, int numberOfSeat, int maxSpeed) {
        super(wheel, numberOfSeat);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int speed() {
        return maxSpeed;
    }

    @Override
    public boolean wheels() {
        return wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", wheel=" + wheel +
                ", numberOfSeat=" + numberOfSeat +
                '}';
    }
}


public class Abstraction {
    public static void main(String[] args) {
        System.out.println("Created a interface transport to hide unnecessary details");
        System.out.println("Implemented Transport in Abstract class to add some variable");
        System.out.println("Extended all the properties of Abstract class and defined all the abstract methods in the Car class");
        Car car = new Car(true, 4, 120);
        System.out.println(car);
    }
}