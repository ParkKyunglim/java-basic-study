package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // this. 인스턴스 자신의 참조값을 뜻함
    void initMember(String name, int age, int grade) {
        this.name = name; // x001.name = "user";
        this.age = age;
        this.grade = grade;
    }
}
