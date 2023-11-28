package d5;

public class WrapperClass {
    public static void main(String[] args) {
        // 1. 참조 타입이지만, String 처럼 값을 할당 가능
        String string = "";
        int primInt = 10;
        // int에 대응되는 참조 타입은 Integer
        Integer refInt = 10;

        // 2. 서로 상호 호환이 된다.
        refInt = primInt;
        primInt = refInt;

        // 3. 사칙연산도 그냥 참조 타입을 바탕으로 사용 가능하다.
        refInt *= 10;
        System.out.println(refInt);



    }


}
