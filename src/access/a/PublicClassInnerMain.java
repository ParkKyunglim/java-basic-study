package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 같은 패키지 접근 가능
        DefalutClass1 class1 = new DefalutClass1();
        DefalutClass2 class2 = new DefalutClass2();
    }
}
