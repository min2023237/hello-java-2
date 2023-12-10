package gptQuiz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringFilter {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("cat");
        strList.add("dog");
        strList.add("elephant");

        Stream<String> strStream = strList.stream()
                .filter( str -> str.length() > 5);

        strStream.forEach(System.out::println);


    }
}
