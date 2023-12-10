package gptQuiz.interfaceExceptionUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 수를 입력하세요.: ");

        try {
            int num1 = scanner.nextInt(); //예외를 발생시킬 수 있으니까 try 안에 배치
            int num2 = scanner.nextInt();

            SimpleCalculator simpleCalc = new SimpleCalculator(); //생성자에서도 예외가 발생할 수 있으니까 가급적 try 안에 배치
            System.out.println("두 수의 합: " + simpleCalc.add(num1, num2));
            System.out.println("두 수의 차: " + simpleCalc.subtract(num1, num2));

        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해주세요.");

        } finally {
            scanner.close();
        }

    }
}
