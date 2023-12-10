package d7.collections;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> contactBook = new HashMap<>();

        // Map에 연락처 저장
        contactBook.put("Alex", "010-ALEX-ALEX");
        contactBook.put("Bob", "010-BOB-BOB");
        contactBook.put("Cherry", "010-CHERRY-CHERRY");

        // 있는 걸 넣을 때는 덮어 씌운다.
//        contactBook.put("Cherry", "010-00IM-GONE");
//
//        // Map에서 연락처 찾아오기
//        System.out.println(contactBook.get("Alex"));
//        System.out.println(contactBook.get("Bob"));
//        System.out.println(contactBook.get("Cherry"));

        // 사전
        // JSON
        // -> Java Map
        // 핸드폰 - 연락처
        // 연락처를 검색하는 기준?
        // 이름 - 전화번호
        // Key - Value
//        Map<String, String> contactBook = new HashMap<>();
//        // Map에 연락처 저장
//        contactBook.put("Alex", "010-ALEX-ALEX");
//        contactBook.put("Bob", "010-BOB-BOB");
//        contactBook.put("Cherry", "010-CHERRY-CHERRY");
//        // Map에서 연락처 찾아오기
//        System.out.println(contactBook.get("Alex"));
//        System.out.println(contactBook.get("Bob"));
//        System.out.println(contactBook.get("Cherry"));
//        System.out.println(contactBook.get("Dave"));
//        //전공생 수
//        Map<String, Integer> numMajorStudent = new HashMap<>();
//        numMajorStudent.put("CES", 10);
//        numMajorStudent.put("EE", 20);
//        numMajorStudent.put("ME", 15);
//        numMajorStudent.put("BA", 30);
//        System.out.println(numMajorStudent);
//
//        //데이터를 넣어야 되는 상황에, 새로운 전공이 생기면?
//
//        // 1. majorCount.get("major)" == null
//        String newMajor = "ENG";
//        if (numMajorStudent.get(newMajor) == null) {
//            numMajorStudent.put(newMajor, 1);
//        } else {
//            int before = numMajorStudent.get(newMajor);
//            numMajorStudent.put(newMajor, before + 1);
//        }
//        // 2. putIfAbsent
//        Integer before = numMajorStudent.putIfAbsent(newMajor, 1);
//        if (before != null) {
//            numMajorStudent.put(newMajor, before + 1);
//        }
//
//        Map<String, List<String>> majorStudents = new HashMap<>(); //여기서 더 복잡해지면 그냥 객체를 만드는 게 낫다.
//        majorStudents.put("CSE", new ArrayList<>());
//        majorStudents.get("CSE").add("Alice");
//        List<String> cseStudents = majorStudents.get("CSE");
//        cseStudents.add("Bob");
//        System.out.println(majorStudents);

        //key만 돌려줌
//        Set<String> keySet = contactBook.keySet();
//        for (String key : keySet) {
//            System.out.println(key);
//            System.out.println(contactBook.get(key));
//        }


        // entrySet() - Key - Value 쌍으로 구성된 Set
//        for (Map.Entry<String, String> entry : contactBook.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }





    }
}
