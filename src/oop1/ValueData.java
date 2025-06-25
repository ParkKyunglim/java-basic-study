package oop1;

public class ValueData {
    int value;

    // 참고: 여기서 만드는 add() 메서드에는 static 키워드를 사용하지 않는다. (추후 설명)
    void add() {
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
