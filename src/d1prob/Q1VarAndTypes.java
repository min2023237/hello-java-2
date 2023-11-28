package d1prob;

/*
사용자에게 입력을 받고,
동일한 내용을 세번 출력하는 코드를 작성하시오.
 */

import java.util.Scanner;

public class Q1VarAndTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scanLine = scanner.nextLine();
        System.out.println(scanLine);
        System.out.println(scanLine);
        System.out.println(scanLine);
    }
}
