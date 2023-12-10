package gptQuiz.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.println("학생의 이름을 입력하세요.");
        //String name = scanner.nextLine();
        student.setName(scanner.nextLine());

        System.out.println(String.format("%s학생의 학번을 입력하세요.", student.getName()));
        //String stuId = scanner.nextLine();
        student.setStuId(scanner.nextLine());

        student.printName();

        scanner.close();

    }
}
