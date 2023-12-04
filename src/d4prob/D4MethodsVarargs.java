package d4prob;

public class D4MethodsVarargs {
    public static void main(String[] args) {
        System.out.println(varNumSum(1, 2, 3, 4, 5));
        int[] numbers = {1, 2, 3, 4};
        System.out.println(varNumSum(numbers));
    }

    public static int varNumSum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
