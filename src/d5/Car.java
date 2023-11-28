package d5;

public class Car{

    //public static int count = 0;
    private static int count = 0;
    //브랜드
    //public String brand;
    private String brand;

    //차종
    //public String name;
    private String name;


    //탱크상태
    //public int fuel;
    private int fuel;

    //클락션을 울리는 기능
    public void beep() {
        System.out.println("빵");
    }

    // 가진 정보를 출력하는 기능
    public void printInfo() {
        System.out.println(String.format("name:\t%s", name));
        System.out.println(String.format("brand:\t%s", brand));
        System.out.println(String.format("fuel:\t%s", fuel));

    }

    // 특정 거리를 이동하는 기능
    public void drive(int kilo) {
        fuel -= kilo / 2;
        System.out.println(String.format("Moved: %d km, Fuel: %d", kilo, fuel));
    }

    public String getBrand() {
        return brand;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

}
