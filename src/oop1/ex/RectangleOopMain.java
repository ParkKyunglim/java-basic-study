package oop1.ex;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        // 계산은 필요한 시점(main)에서 호출해 계산
        //rectangle.area처럼 필드로 저장하면, 값 변경 시 오류 가능성 있음
        
        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);


    }

}
