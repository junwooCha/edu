package Practice;

public class te6 {
    public static void main(String[] args) {
        int star = 0;
        while(true) {

            if (star < 5) {
                System.out.printf("* ");
            } else if (star == 5) {
                System.out.printf("\n *");
            } else if (star > 5 && star < 9) {
                System.out.printf(" *");
            } else if (star == 9) {
                System.out.printf("\n  ");
            } else if (star > 9 && star < 13) {
                System.out.printf("* ");
            } else if (star == 13) {
                System.out.printf("\n   ");
            } else if (star >13 && star<16) {
                System.out.printf("* ");
            } else if (star == 16){
                System.out.printf("\n    ");
            }else {
                System.out.println("*");
                break;
            }
            star++;
        }


    }
}
