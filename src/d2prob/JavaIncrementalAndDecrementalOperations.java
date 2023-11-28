package d2prob;

public class JavaIncrementalAndDecrementalOperations {
    public static void main(String[] args) {
        int x = 10;
//        System.out.println(++count);  // 출력: 11 (출력 전에 1 증가, 값: 11)
//        System.out.println(count++);  // 출력: 11 (출력 후에 1 증가, 값: 12)
//        System.out.println(--count);  // 출력: 11 (출력 전에 1 감소, 값: 11)
//        System.out.println(count--);  // 출력: 11 (출력 후에 1 감소, 값: 10)
        int y = 10;
        int result1 = ++x + 10;
        int result2 = y++ + 10;
        System.out.println(result1);
        System.out.println(result2);
    }
}
