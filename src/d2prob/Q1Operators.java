package d2prob;

/*
세 과목의 시험점수(int)가 입력될 때,
평균 점수(double)를 구하여라.
 */

import java.util.Scanner;

public class Q1Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] testScore = new int[3];
        testScore[0] = scanner.nextInt();
        testScore[1] = scanner.nextInt();
        testScore[2] = scanner.nextInt();

        double average = (testScore[0] + testScore[1] + testScore[2]) / 3;
        System.out.println(average);


    }


}
