package d8.file;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

//FileReader의 가장 큰 문제점은 한글자씩 읽는다는 것
public class BufferFileMain {
    public static void main(String[] args) {
        List<String> readLines = new ArrayList<>();
        // Map으로 바꿔서,
        List<Person> people = new ArrayList<>();
        // 시작은 try-with-resource
        // BufferedReader는 파일을 읽기 위해서가 아니라
        // 전체적인 입출력 과정에 버퍼링 기능을 더해주기 위해서
        try(FileReader fileReader = new FileReader("people.csv");
            BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                readLines.add(line);
                //쉼표를 기준으로 나눈다.
                String[] seperated = line.split(",");
                Person person = new Person(
                        seperated[0],
                        seperated[1],
                        Integer.parseInt(seperated[2]),
                        seperated[3]
                );
                people.add(person);
            }

        }catch (IOException e) {
            System.out.println("Error Opening File: " + e.getMessage());
        }

        for (Person person : people) {
            System.out.println("name: " + person.getName());
            System.out.println("age: " + person.getAge());
        }

        // 파일 입출력은 장기기억장치에 입출력을 하는 것이기 때문에,
        // 입출력 횟수를 줄여야... 속도가 빨라지낟.
        try(FileWriter fileWriter = new FileWriter("people2.csv");
            BufferedWriter writer = new BufferedWriter(fileWriter)) {
//            for (String line : readLines) {
//                writer.write(line);
//                writer.newLine();
//            }
            for (Person person : people) {
                String line = String.format(
                        "%s,%s,%d,%s",
                        person.getName(),
                        person.getEmail(),
                        person.getAge(),
                        person.getGender()
                );
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error Writing File: " + e.getMessage());
        }
    }
}
