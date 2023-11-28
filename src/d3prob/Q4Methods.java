package d3prob;

public class Q4Methods {
    public static int avg(int[] intNums) {
        int sum = 0;
        for (int number : intNums) {
            sum += number;
        }
        return sum / intNums.length;
    }

    public static long avg(long[] longNums) {
        long sum = 0;
        for (long number : longNums) {
            sum += number;
        }
        return sum / longNums.length;
    }

    public static double avg(double[] doubleNums) {
        double sum = 0;
        for (double number : doubleNums) {
            sum += number;
        }
        return sum / doubleNums.length;
    }

    //메인
    public static void main(String[] args) {
        int[] intNums = {1,2,3};
        long[] longNums = {2,4,6};
        double[] doubleNums = {1,3,5};

        System.out.println(avg(intNums));
        System.out.println(avg(longNums));
        System.out.println(avg(doubleNums));

    }
}
