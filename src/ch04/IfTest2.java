package ch04;

public class IfTest2 {
    public static void main(String[] args){
        int score = 89;
        char grade = 'D';
        char pm = ' ';

        if (score >= 90) {
            grade = 'A';
            if(score >= 98) {
                pm = '+';
            }else if (score <= 93){
                pm = '-';
            }
        } else if (score >= 80) {
            grade = 'A';
            if (score >= 98) {
                pm = '+';
            } else if (score <= 93) {
                pm = '-';
            }
        } else if (score >= 70) {
            grade = 'A';
            if(score >= 98) {
                pm = '+';
            }else if (score <= 93) {
                pm = '-';

            }
        }
    }
}