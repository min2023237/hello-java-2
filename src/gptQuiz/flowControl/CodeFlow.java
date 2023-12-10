package gptQuiz.flowControl;

//사용자로부터 반복적으로 숫자를 입력받습니다. 이때, 입력은 정수로 받습니다.
//사용자가 0을 입력하면, 입력을 중단하고 그 시점까지 입력받은 숫자들의 평균값을 계산하여 출력합니다.
//0을 입력하기 전까지 입력된 숫자의 개수와 합을 추적해야 합니다.
//평균은 소수점 두 자리까지 표시합니다.

import java.util.Scanner;

public class CodeFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;

        while(true) {
            // System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");
            int scanInt = scanner.nextInt();
            count++;
            sum += scanInt;

            if (scanInt == 0) {
                System.out.println(sum/(count-1));
                break;
            }
        }

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0; // 숫자의 합계
//        int count = 0; // 입력받은 숫자의 개수
//        double average; // 평균
//
//        while (true) {
//            System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");
//            int number = scanner.nextInt();
//
//            if (number == 0) {
//                break; // 0 입력시 반복 중단
//            }
//
//            sum += number; // 합계 업데이트
//            count++; // 카운트 증가
//        }
//
//        // 평균 계산 및 출력 (0으로 나누는 경우 방지)
//        if (count > 0) {
//            average = (double) sum / count;
//            System.out.printf("입력한 숫자들의 평균: %.2f\n", average);
//        } else {
//            System.out.println("입력된 숫자가 없습니다.");
//        }

        scanner.close();

    }
}
