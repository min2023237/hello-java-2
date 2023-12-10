package d5;

public class Car{

    private static int count = 0;
    private int fuel;

    public void beep() {
        System.out.println("빵빵");
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void drive(int kilos) {
        this.fuel -= kilos / 10;
    }

}
