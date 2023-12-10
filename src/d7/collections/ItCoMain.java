package d7.collections;

import java.util.*;

//List 대신 set으로 바꿔도 동일하게 동작한다.

public class ItCoMain {
    public static void main(String[] args) {
        List<String> skillList = new ArrayList<>();
        skillList.add("Java");
        skillList.add("git");
        skillList.add("md");
        skillList.add("python");
        skillList.add("aws");
        skillList.add("linux");
//        for (String skill : skillList) {
//            System.out.println(skill);
//            // 순회중 제거하면 예외가 발생.
//            skillList.remove("python"); //중간에 하나를 삭제
//        }

//        Iterator<String> iter = skillList.iterator();
//        while(iter.hasNext()) {
//            String skill = iter.next();
//            System.out.println(skill);
//
//            if("python".equals(skill))
//                iter.remove();
//        }
//        System.out.println(skillList);

//        List<String> listCollection = new ArrayList<>();
//        Set<String> setCollection = new HashSet<>();
//        //List의 Collection 메서드들
//        System.out.println(listCollection.size());
//        System.out.println(listCollection.isEmpty());
//        System.out.println(listCollection.contains(""));
//        System.out.println(listCollection.containsAll(setCollection));
//        // Set의 Collection 메서드들
//        System.out.println(setCollection.size());
//        System.out.println(setCollection.isEmpty());
//        System.out.println(setCollection.contains(""));
//        System.out.println(setCollection.containsAll(listCollection));
//
//        // Collection의 문서를 보면,
//        // Collection 인터페이스를 구현하는 클래스는
//        // 1. 아무것도 없는 기본 생성자와
//        // 2. 다른 Collectino을 받아 그 모든 원소를 가지는 생성자를 만듦이 마땅하다.
//        // 두 개의 생성자는 꼭 만들어줘라는 뜻.
//        // 서로 필요할 때 바꿔가면서 쓰라고.
//
//        //list와 set은 상호호환이 된다.
//        List<String> listWithDuplications = new ArrayList<>();
//        listWithDuplications.add("Java");
//        listWithDuplications.add("Java");
//        listWithDuplications.add("Java");
//        listWithDuplications.add("Java");
//        Set<String> setNoDups = new HashSet<>(listWithDuplications);
//        System.out.println(setNoDups);



    }


}
