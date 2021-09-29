package ch04;

public class IfTest4 {
    public static void main(String[] atgs) {
        String position = "대리";

        if("부장".equals(position)) {
            System.out.println("700만원");
        } else if("과장".equals(position)) {
            System.out.println("500만원");
        }else{
            System.out.println("300만원");
        }

    }
}
