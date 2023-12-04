package d8.stream;

public class LambdaDemo {
    public static void main(String[] args) {
        //NoArgRetFunction function = () -> System.out.println("Hello, Lambda!");
        NoArgRetFunction function = new NoArgRetFunction() {
            @Override
            public void noArgNoReturn() {
                System.out.println("Hello, Lambda!");
            }
        };
        function.noArgNoReturn();
    }
}
