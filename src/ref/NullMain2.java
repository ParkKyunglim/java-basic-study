package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생 (참조할 주소가 존재하지 않는다)
        System.out.println("data = " + data.value);
    }
}
