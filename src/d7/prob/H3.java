package d7.prob;

import java.util.*;

public class H3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> inputSet = new HashSet<>();
        while (true) {
            String input = scanner.nextLine();
            if("q".equals(input)) break;
            // 집합은 기본적으로 중복을 허용하지 않는다.
            inputSet.add(input);
        }

        List<String> names = new ArrayList<>(inputSet);
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }

    }
}
