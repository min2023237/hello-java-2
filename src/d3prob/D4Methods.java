package d3prob;

public class D4Methods {

    //main 메서드
    public static void main(String[] args) {

        System.out.println(factorial(7));

    }
    public static int factorial(int n)  {
        //0이나 1이면 1을 반환한다.
        if (n == 1 || n == 0) {
            return 1;
        }
        // 아니면 n * f(n-1)를 반환한다.
        else {
            return n * factorial(n -1);
        }
    }


}
