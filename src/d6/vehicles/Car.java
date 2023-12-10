package d6.vehicles;

public class Car {
    private String brand;
    private String model;
    private int maxSpeed;

    public Car(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate() {
        System.out.println(this.model + " is accelerating.");
    }

    public void brake() {
        System.out.println(this.model + " is breaking.");
    }
}
