package gptQuiz.userInput;

//문제: 자바 프로그램을 사용하여 사용자로부터 다음 정보를 입력받고 출력하세요:
//
//사용자의 이름을 입력받습니다. 이 때, 문자열 형태로 입력을 받으세요.
//사용자의 나이를 입력받습니다. 이 때, 정수 형태로 입력을 받으세요.
//입력받은 이름과 나이를 포맷에 맞게 출력하세요. 예: "당신의 이름은 [이름]이고, 나이는 [나이]살입니다."

import java.util.Scanner;

public class InputHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String scanLine = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int scanInt = scanner.nextInt();

        System.out.println(String.format("당신의 이름은 %s이고, 나이는 %d 살입니다.", scanLine, scanInt));
        // System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");

        scanner.close();

    }
}
