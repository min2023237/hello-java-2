package d4prob;

public class D4Methods {
    public static void main(String[] args) {
        int a = 1, b = 2;
        long c = 1, d = 2;

        System.out.println(addInt(a, b));
        //System.out.println(addInt(c, d));
        System.out.println(addLong(a, b));
        System.out.println(addLong(c, d));
    }

    public static int addInt(int a, int b) {
        return a + b;
    }

    public static long addLong(long a, long b) {
        return a + b;
    }

}
