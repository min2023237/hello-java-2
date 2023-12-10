package d5;

public class Main {
    public static void main(String[] args) {
        Car porter = new Truck();
        porter.beep();
        refuel(porter);
    }

    public static void refuel(Car car) {
        car.setFuel(100);
    }
}
