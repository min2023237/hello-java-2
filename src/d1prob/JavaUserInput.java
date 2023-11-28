package d1prob;

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        byte scanByte = scanner.nextByte();
//        short scanShort = scanner.nextShort();
        int scanInt = scanner.nextInt();
//        long scanLong = scanner.nextLong();
//
//        System.out.println("scanByte: " + scanByte);
//        System.out.println("scanShort: " + scanShort);
//        System.out.println("scanInt: " + scanInt);
//        System.out.println("scanLong: " + scanLong);

        String scanLine = scanner.nextLine();

        System.out.println("scanInt: " + scanInt);
        System.out.println("scanLine: " + scanLine);

    }
}
