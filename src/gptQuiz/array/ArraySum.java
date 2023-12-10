package gptQuiz.array;

import java.util.Scanner;

//문제: 자바 프로그램을 사용하여 다음 요구사항을 충족시키세요:
//
//5개의 정수를 저장할 수 있는 배열을 선언합니다.
//사용자로부터 5개의 정수를 입력받아 배열에 저장합니다. 각 정수는 새로운 줄에서 입력받습니다.
//배열에 저장된 모든 정수의 합을 계산하고 출력합니다.
public class ArraySum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] fiveIntArr = new int[5];
        // int[] numbers = new int[5];

        int sum = 0;

        // System.out.println("5개의 정수를 입력하세요:");

        for( int i=0; i<fiveIntArr.length; i ++) {
            System.out.println(String.format("%d번째 정수를 입력하세요.", i+1));
            int scanInt = scanner.nextInt();
            fiveIntArr[i] = scanInt;
            //fiveIntArr[i] = scanner.nextInt();

            sum = sum + fiveIntArr[i];
            // sum += fiveIntArr[i];
        }

        System.out.println(sum);
        // System.out.println("입력된 정수의 합: " + sum);

        //scanner.close();

    }
}
