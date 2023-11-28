package d3prob;

public class D4Varargs {
    // Varargs - 가변인자
    public static int varargAvg(int... ints) {
        int sum = 0;

        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum / ints.length;

    }

    public static void main(String[] args) {
        System.out.println(varargAvg(1,2,3,4,5));

    }
}
