package d8.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileMain {
    public static void main(String[] args) {
        // try-with-resources
        // AutoClosable를 구현하면 사용 가능
        List<Character> readChars = new ArrayList<>();
        try(FileReader reader = new FileReader("hello")){
            int character;
            while((character = reader.read()) != -1) {
                System.out.print((char) character);
                readChars.add((char) character);
            }
        }catch (IOException ignored) {}

        try (FileWriter writer = new FileWriter("output.txt", true)) {
            for (Character character : readChars) {
                writer.write(character);
            }
        } catch (IOException ignored) {}
    }
//    public static void main(String[] args) {
//        try {
//            FileReader reader = new FileReader("hello");//FileReader는 java io에 있는 클래스. 괄호 안에는 어떤 파일을 넣을지.
//            int character;
//
//            // 여러 데이터를 모아서 문자열을 만들어주는 클래스
//            StringBuilder line = new StringBuilder();
//
//            //FileReader.read()는 한글자씩 읽는다.
//            // -1은 파일을 다 읽었다는 뜻
//            while((character = reader.read()) != -1) {
//                System.out.println((char) character);
//                line.append((char)character);
//            }
//            // 출력부는 필요한대로
//            System.out.println(line.toString());
//
//            String newLine = line.toString();
//            String[] lines = newLine.split("\n");
//            for (String oneLine : lines) {
//                System.out.println(oneLine);
//            }
//            reader.close(); // 이걸 하지 않으면 메모리를 차지하고 있는 프로세스가 다 찬다? lock 문제 등 발생
//            //catch나 finally에는 넣을 수 없다.
//
//
//        } catch (IOException ignored) {
//            System.out.println("Error!");
//
//        }
//
//    }
}
