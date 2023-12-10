package gptQuiz.oop;

//객체 지향 프로그래밍: '학생' 클래스를 만들고, 이름과 학번을 필드로 가지며,
//이 정보를 출력하는 메서드를 포함시키세요.
//이후, 메인 메서드에서 학생 객체를 생성하고 정보를 출력하는 프로그램을 작성하세요.

public class Student {
    // 필드
    private String name;
    //public int stuId;
    private String stuId;

    // 생성자

    // 메서드
    // Getter
    public String getName() {
        return name;
    }

    public String getStuId() {
        return stuId;
    }

    // Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public void printName () {
        System.out.println(String.format("%s학생의 학번은 %s입니다.", name, stuId));
    }
}
