package Practice;

public class te7 {
    public static void main(String[] args) {
        String[] Korean = {"가", "나", "다", "라", "마"};
        String[] star = new String[30];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 0) {
                    System.out.printf(Korean[0]);
                    star[0] = Korean[0];
                } else if (i == 1 && j == 1) {
                    System.out.printf(Korean[1]);
                    star[1] = Korean[1];
                } else if (i == 2 && j == 2) {
                    System.out.printf(Korean[2]);
                    star[2] = Korean[2];
                } else if (i == 3 && j == 3) {
                    System.out.printf(Korean[3]);
                    star[3] = Korean[3];
                }
                    System.out.printf("*");
                }
            if(i<4) {
                System.out.printf("");
            }else{
                System.out.printf(Korean[4]);
                star[4] = Korean[4];
            }System.out.println(star[i]);
        }
    }
}

