package ex01;

class Example {
    static int a = 0;
    int b = 0;
}

public class Example01 {
    public static void main(String[] args) {
        Example num1 = new Example();
        Example num2 = new Example();

        num2.b++;
        num2.a++;

        System.out.println(num1.a); // static영역에 올라와있기떄문에 변수값 공유
        System.out.println(num1.b);
    }
}
