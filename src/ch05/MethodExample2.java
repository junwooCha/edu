package ch05;

public class MethodExample2 {
    public static void main(String[] args){
        int result = sum(10, 20);
        System.out.println("sum : " + result);
    }

    public static int sum(int n1, int n2){
        return n1 + n2;
    }
    //void = return 생략가능, 비void(int등등)은 return생략불가능
}
