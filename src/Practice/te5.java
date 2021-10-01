package Practice;

public class te5 {
    public static void main(String[] args){
        int star = (int)(Math.random() * 5) + 2;
        System.out.println("star : " + star);

        for(int i=0; i<star; i++) {
            for(int z=0; z<star; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
