import java.util.Scanner;

public class Q4Control {
    public static void main(String[] args) {
//        정수 n이 입력된 뒤, n개의 이름이 개행을 기준으로 입력이 된다고 가정할 때,
//                n개의 이름을 입력된 순서의 반대로 출력하여라.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 정수 입력 이후 개행 소모 용도
        scanner.nextLine();

        String[] names = new String[n];
        // n개의 이름 입력 받기
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();

            //System.out.println(name);
        }
        //이 시점에서 모든 이름을 입력받은 상태이다.
        for (int i = 0; i < n; i++) {
            System.out.println(names[n -1 -i]);
        }


    }
}
