package d7.collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        // HashSet 생성
//        HashSet<String> fruitSet = new HashSet<>();
//
//        // 요소 추가
//        fruitSet.add("Apple");
//        fruitSet.add("Banana");
//        fruitSet.add("Cherry");
//        fruits.add("Apple"); // 중복 요소는 추가되지 않는다.

//        // 요소 존재 여부 확인
//        if (fruits.contains("Banana")) {
//            System.out.println("Banana가 존재합니다.");
//        }

        // 요소 제거
//        fruits.remove("Cherry");

        // ArrayList 생성 및 과일 추가
//        List<String> fruitList = new ArrayList<>();
//        fruitList.add("Mango");
//        fruitList.add("Banana"); // 중복된 과일
//        fruitList.add("Grape");

        // remove 메서드 사용하여 ArrayList에서 "Mango" 요소 제거
//        fruitList.remove("Mango");

        // fruitSet에 담겨 있는 과일 출력
//        System.out.println("현재 fruitSet 과일 세트:");
//        for (String fruit : fruitSet) {
//            System.out.println(fruit);
//        }
//        System.out.println("현재 fruitSet: " + fruitSet);
//
//        System.out.println("현재 fruitList: " + fruitList);
//        // fruitList에 담겨 있는 과일 출력
//        System.out.println("현재 fruitList 과일 세트:");
//        for (String fruit : fruitList) {
//            System.out.println(fruit);
//        }

        // removeAll 메서드로 fruitSet에서 fruitList에 있는 모든 요소 제거
//        boolean isRemoved = fruitSet.removeAll(fruitList);
//        System.out.println("제거된 요소가 있습니까? " + isRemoved);
//        System.out.println("현재 fruitSet: " + fruitSet);
//
//        // clear 메서드로 fruitSet의 모든 요소 제거
//        fruitSet.clear();
//        System.out.println("fruitSet 비우기 후: " + fruitSet);

//        // HashSet의 모든 요소를 출력
//        System.out.println("현재 과일 세트:");
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//        // 첫 번째 addAll 호출
//        boolean firstAddAllResult = fruitSet.addAll(fruitList); // 새로운 요소가 추가되므로 true 반환
//        System.out.println("첫 번째 addAll 결과: " + firstAddAllResult);
//        System.out.println("현재 HashSet: " + fruitSet);
//
//        // 두 번째 addAll 호출
//        boolean secondAddAllResult = fruitSet.addAll(fruitList); // 추가할 새로운 요소 없으므로 false 반환
//        System.out.println("두 번째 addAll 결과: " + secondAddAllResult);
//        System.out.println("현재 HashSet: " + fruitSet);

        List<Pigeon> listHoles = new ArrayList<>();
        Set<Pigeon> setHoles = new HashSet<>();

        for (int i = 0; i<20; i++) {
            Pigeon pigeon = new Pigeon(i%10);
            listHoles.add(pigeon);
            setHoles.add(pigeon);

        }
        System.out.println("리스트의 비둘기: " + listHoles.size());
        System.out.println("집합의 비둘기: " + setHoles.size());


    }
}
