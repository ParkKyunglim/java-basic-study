package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a); // a 값 10을 복사해서 전달, 각 각 숫자 10을 가진다
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20; // 변수 x의 값만 변경되고 a는 10 유지
    }
}
