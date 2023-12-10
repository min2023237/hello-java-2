package gptQuiz.interfaceExceptionUtils;

public class SimpleCalculator implements Calculator{

    @Override
    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    @Override
    public int subtract(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }
}
