package d7.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // 요소 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 특정 인덱스에 요소 추가
        fruits.add(1, "Blueberry");

        // 요소 접근
        String firstFruit = fruits.get(0);
        //System.out.println("첫 번째 과일: " + firstFruit);

        // 요소 수정
        fruits.set(2, "Blackberry");

        //데이터 찾기
        //System.out.println("Cherry is at: " + fruits.indexOf("Cherry"));
        //System.out.println("Peach is at: " + fruits.indexOf("Peach"));

        // 데이터 제거하기
//        System.out.println(fruits.remove(3));    // 순서를 기준으로
//        System.out.println(fruits.remove("Apple"));  // 값을 기준으로
//        System.out.println(fruits.remove("Apple"));  // 값을 기준으로 찾는데 실패


        // ArrayList의 모든 요소를 출력
        //System.out.println("현재 과일 목록:");
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

        ArrayList<Integer> intArrayList = new ArrayList<>();
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        sum(intArrayList);
        sum(intLinkedList);

    }

    // 매개변수로 전달할때는 기능을 중요시하는 interface 기준으로 매개변수 선언
    public static int sum(List<Integer> intList) {
        return 0;
    }
}
