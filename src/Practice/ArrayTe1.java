package Practice;

public class ArrayTe1 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            if (i == 0) {
                System.out.printf("가");
            }
            for (int j = 0; j < 4; j++) {
                if(i==1 && j==1){
                    System.out.printf("나");
                }else if(i==2 && j==2) {
                    System.out.printf("다");
                }else if(i==3 && j==3) {
                    System.out.printf("라");
                }
                System.out.printf("*");

            }if(i<4) {
                System.out.printf("1");
            }else {
                System.out.printf("마");
            }System.out.println();
        }

    }
}
