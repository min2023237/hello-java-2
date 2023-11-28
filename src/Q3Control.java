import java.util.Scanner;

/*
 정수 n과 n개의 정수가 순서대로 입력된다.
 n개의 정수의 총합, 평균을 출력하여라.
 */
public class Q3Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < n; i++) {
            sum += scanner.nextInt();

        }
        avg = sum/n;

        System.out.println("합계:"+sum);
        System.out.println("평균:"+avg);



    }

}
