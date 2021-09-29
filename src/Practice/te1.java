package Practice;

public class te1 {
    public static void main(String[] args){
        int mon = (int)(Math.random() * 12) + 1;
        System.out.printf("%d월", mon);

        switch (mon){
            case 12: case 1: case 2:
                System.out.printf("겨율");
                break;
            case 3: case 4: case 5:
                System.out.printf("봄");
                break;
            case 6: case 7: case 8:
                System.out.printf("여름");
                break;
            case 9: case 10: case 11:
                System.out.printf("가을");
                break;
            default:
                System.out.printf("알수 없음");


        }



    }
}
