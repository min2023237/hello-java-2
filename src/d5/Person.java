package d5;

public class Person {

    //이름
    public String name;

    //나이
    public int age;

    //인사하는 기능
    public void greetings(String name) {
        System.out.println(String.format("Hello, my name is %s!", name) );
    }
}
