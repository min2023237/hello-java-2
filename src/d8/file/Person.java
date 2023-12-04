package d8.file;


// 이런 식으로 데이터를 들고 있는 JAVA 객체 = POJO(포조스)
public class Person {
    private String name;
    private String email;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, String email, int age, String gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
