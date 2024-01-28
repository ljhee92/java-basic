package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        // 대원칙: 자바에서 변수는 항상 값을 복사해서 대입한다.
        int a = 10;
        System.out.println("메서드 호출 전 a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 a = " + a);
    }   // main

     static void changePrimitive(int x){
        x = 20;
    }   // changePrimitive
}   // class
