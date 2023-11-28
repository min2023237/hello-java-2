package d1prob;

import java.util.Scanner;

/*
사용자에게 3개의 0.0 ~ 4.5 사이의 실수를 입력받고
그 뒤에 3개의 이름을 입력받은 뒤
이름 - <이름>, 학점 - <실수>
의 형태로 출력하는 프로그램을 작성하시오.
 */
public class Q5VarAndTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] scanDouble = new double[3];
        scanDouble[0] = scanner.nextDouble();
        scanDouble[1] = scanner.nextDouble();
        scanDouble[2] = scanner.nextDouble();

        String[] scanName = new String[3];
        scanName[0] = scanner.nextLine();
        scanName[1] = scanner.nextLine();
        scanName[2] = scanner.nextLine();

        System.out.println(String.format("이름 - <%s>, 학점 - <%f>", scanName[0], scanDouble[0]));
        System.out.println(String.format("이름 - <%s>, 학점 - <%f>", scanName[1], scanDouble[1]));
        System.out.println(String.format("이름 - <%s>, 학점 - <%f>", scanName[2], scanDouble[2]));


    }

}
