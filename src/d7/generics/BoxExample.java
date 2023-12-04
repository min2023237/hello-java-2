package d7.generics;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.set("hello");
        String str = box.get();
    }
}
