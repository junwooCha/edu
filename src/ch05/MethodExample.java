package ch05;

public class MethodExample {
    public static void main(String[] srgs) {
        sum(10, 20);
        sum(50, 120);
        minus(100, 50, 30);
    }

    public static void sum(int n1, int n2) {
        System.out.println("sum : " + (n1 + n2));
    }

    public static void minus(int n1, int n2, int n3) {
        System.out.println("sum : " + (n1 + n2));
    }
}
