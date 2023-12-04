package d8.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        String[] nameArray = {"Alex", "Dave", "Chad", "Brad"};
        // Stream<T>는 데이터가 흘러감을 나타내는 객체
        Stream<String> nameArrStream = Arrays.stream(nameArray);

        //원시타입 스트림
        int[] intArray = {1, 23, 24, 54, 6}; //Wrapper class가 아니라서 stream으로 바꾸는데? 문제가 있다.
        IntStream intStream = Arrays.stream(intArray);

        // 문자열을 문자 스트림
        String email = "somin@gmail.com";
        IntStream charStream = email.chars();

        // Collection.stream()
        List<String> nameList = new ArrayList<>();
        nameList.add("Alex");
        nameList.add("Dave");
        nameList.add("Chad");
        nameList.add("Brad");

        Stream<String> nameListStream = nameList.stream()
                .filter(name -> name.contains("a")) // 결과 : stream
                .map(name -> name.toUpperCase()) // 결과 : stream
                .sorted(); // 결과 : stream


        useFunction(String::length);

        //System.out.println(nameListStream.count());







        //nameListStream.forEach(System.out::println);

        /*
        Stream<String> nameStream1 = nameListStream
                .filter(name -> name.contains("a"));
        Stream<String> nameStream2 = nameStream1
                .map(name -> name.toLowerCase());
        */

        //선별
//        nameListStream
                // 데이터를 선별하는데.
                // 선별하는 기준을 전달해야 한다.
                //.filter(name -> name.contains("x")) //참이면 남기고 거짓이면 버린다.

                // 데이터를 받아 새로운 데이터를 반환
                //.map(name -> name.toUpperCase())
//                .map(name -> {
//                    String nameLower = name.toLowerCase();
//                    String nameUpper = name.toUpperCase();
//                    return nameLower + nameUpper;
//                })
                //데이터를 받아 전달받은 기준으로 정렬을 한다.
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);


        }
        public static void useFunction(StringArgFunction function) {
            System.out.println(function.run("lorem ipsum"));
        }
        //입력은 무엇이며 결과는 무엇일까?
//        public boolean predicate(String input) {
         //return input.contains("a"); // 문자열에 a가 포함되었는지 판단하는 메서드
//            return input.length() >= 4; //문자열의 길이가 4이상인지 판단하는 메서드
//        }
}
