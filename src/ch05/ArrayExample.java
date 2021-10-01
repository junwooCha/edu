package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        /*
        같은 타입의 값을 여러개 저장할 때 좋아요!
        for문과 함께 사용하면 개꿀~~
         */

        int[] scores = { 83, 93, 87, 100, 50 };

        System.out.println(scores.length);

        for(int i=0; i<scores.length; i++){
            System.out.println(  scores[i]  );

        }
    }
}
