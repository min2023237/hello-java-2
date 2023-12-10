package gptQuiz.operator;

//문제: 자바 프로그램을 사용하여 다음 요구사항을 충족시키세요:
//
//사용자로부터 두 개의 실수를 입력받습니다.
//입력받은 두 수에 대하여 다음 연산을 수행하고 그 결과를 출력합니다:
//더하기
//빼기
//곱하기
//나누기 (단, 두 번째 수가 0이 아닐 때만)
//나누기 연산 시 두 번째 수가 0인 경우, 사용자에게 오류 메시지를 출력하고 다른 연산은 정상적으로 수행합니다.

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("2개의 정수를 입력하세요:");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        int sum = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int multiply = firstNum * secondNum;


        System.out.println("더하기 결과: " + sum);
        System.out.println("빼기 결과: " + sub);
        System.out.println("곱하기 결과: " + multiply);


        if (secondNum == 0) {
            System.out.println("0이 있어서 나눗셈 연산을 할 수 없습니다.");
        } else {
            int division = firstNum / secondNum;
            System.out.println("나눗셈 결과: " + division);
        }

        // 사용자로부터 두 실수 입력받기
//        System.out.print("첫 번째 숫자를 입력하세요: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("두 번째 숫자를 입력하세요: ");
//        double num2 = scanner.nextDouble();
//
//        // 더하기, 빼기, 곱하기 연산 수행
//        System.out.println("더하기 결과: " + (num1 + num2));
//        System.out.println("빼기 결과: " + (num1 - num2));
//        System.out.println("곱하기 결과: " + (num1 * num2));
//
//        // 나누기 연산 수행 (두 번째 수가 0이 아닐 때만)
//        if (num2 != 0) {
//            System.out.println("나누기 결과: " + (num1 / num2));
//        } else {
//            System.out.println("0으로 나눌 수 없습니다.");
//        }

        scanner.close();
    }
}
