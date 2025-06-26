package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // this() 생성자 내부에서 자신의 생성자 호출 - 중복 제거
    // 첫 줄에서만 사용 가능
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 변경
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
