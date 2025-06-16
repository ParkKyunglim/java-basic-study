package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10; // 참조값 x001을 가졌다고 가정
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA); // 값을 복사해서 대입 -> dataA 참조값을 복사하여 전달
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 같은 참조값 (x001을 가리킴) value 20
    }

    static void changeReference(Data dataX) {
        dataX.value = 20; // x001 접근하고 그 안의 value 값을 변경
    }
}
