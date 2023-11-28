package d2prob;

import java.util.Scanner;

/*
현재 오전 7시이다.
정수 n을 입력받아서,
n 시간 후 12시까지 표기된 시계에서
시침이 어떤 숫자 위에 있는지 구하시오. (단, 12시는 0으로 표기한다)
0 <= n <= 127;
 */
public class Q2Operators {
    public static void main(String[] args) {
        int currentTime = 7;

        Scanner scanner = new Scanner(System.in);
        int scanInt = scanner.nextInt();

        int futureTime = (scanInt + currentTime) % 12;
        System.out.println(futureTime);

    }
}
