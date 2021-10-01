package ch05;

public class MethodTest2 {
    public static void main(String[] args){
        String oddEven = getOddEven(10);

        System.out.println("홀짝 : " + oddEven);
    }
    public static String getOddEven(int val) {
        if (val % 2 == 0) {
            return "짝수";
        }
        return "홀수";
    }
}
