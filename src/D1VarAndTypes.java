public class D1VarAndTypes {
    public static void main(String[] args) {
            int a = 100;
            System.out.println(a);

            String b = "Hello, World!";
            System.out.println(b);

            int ame = 1500;
            int cappuccino = 2500;
            int caffeLatte = 3000;
            int caffeMocha = 4000;

            // 아메 5잔
            int result1 = ame *5;


            //카푸치노 3잔 + 카페라떼 2잔
            int result2 = cappuccino * 3 + caffeLatte *2;


            //카페모카 1잔 + 아메 3잔
            int result3 = caffeMocha * 1 + ame * 3;

            System.out.println("아메5잔: "+ result1 + ", 카푸치노 3잔 + 카페라떼 2잔: " + result2 + ", 카페모카 1잔 + 아메3잔: " + result3);


    }
}
