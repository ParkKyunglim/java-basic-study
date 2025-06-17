package ref;

// import 주의
public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    // 메서드 하나로 생성과 초기값 설정 처리
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); // 생성 x001
        student.name = name; // 값 대입
        student.age = age;
        student.grade = grade;
        // 메서드 안에서 객체 생성 -> 반환해야 메서드 밖에서 사용 가능
        return student; // x001 참조값 반환
    }


    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
