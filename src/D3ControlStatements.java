import java.util.Scanner;

public class D3ControlStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 나이를 입력받고, 나이가 20미만일때 입장불가 출력
//        int age = scanner.nextInt();
//        if (age < 20) {
//            System.out.println("입장불가");
//            System.out.println(String.format("%d년 뒤에 오세요", 20 - age));
//
//        }

        int multiple = scanner.nextInt();
        // multiple이 2의 배수면, 2의 배수 출력
        if (multiple % 2 == 0) {
            System.out.println("2의 배수");
        }

        // multiple이 5의 배수면, 5의 배수 출력
        if (multiple % 5 == 0) {
            System.out.println("5의 배수");
        }

        // multiple이 10의 배수면, 10의 배수 출력
        if (multiple % 10 == 0) {
            System.out.println("10의 배수");
        }

        // 몇년도인지 판단한다.
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println("윤년일까?");
            if (year % 100 != 0) {
                System.out.println("윤년이다.");
            }
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("윤년 아니다.");
            }
            if (year % 400 == 0) {
                System.out.println("윤년이다.");
            }
        }

        //
        int score = scanner.nextInt();
        if (score > 80) {
            System.out.println("Good Job");
        }
        else{
            System.out.println("Too Bad");
        }
    }
}
