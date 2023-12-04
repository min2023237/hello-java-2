package d8.stream;

public class Main {
    public static void main(String[] args) {

        NoArgRetFunction anClass = new NoArgRetFunction() {
            @Override
            public void noArgNoReturn() {
                System.out.println("Anonymous Inner Class");

            }
        };

        NoArgRetFunction lamba = () -> System.out.println("Lambda Expression");
        NoArgRetFunction multiLineLambda = () -> {
            System.out.println("MultiLine");
            System.out.println("Lambda");
        };


    }
}
