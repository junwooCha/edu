package ch05;

public class ArrayInArrayTest {
    public static void main(String[] args) {
        int[][] scores = {
                {75, 100, 88},
                {98, 100, 76},
                {100, 90, 100}
        };

        String[] names = {"김영희", "김철수", "홍길동"};
        int[] stuScore = new int[names.length];

        String[] clsArr = {"수학", "영어", "국어"};
        int[] clsScore = new int[clsArr.length];
        for (int i = 0; i < scores.length; i++) {
            for (int z = 0; z < scores[i].length; z++) {
                int score = scores[i][z];
                clsScore[i] += score;
                stuScore[z] += score;
            }
        }
        for (int i = 0; i < stuScore.length; i++) {
            System.out.printf("%s 총점: %d점, 평균: %.1f점\n", names[i], stuScore[i]
                    , (float) stuScore[i] / clsArr.length);
        }
        for (int i = 0; i < clsScore.length; i++) {
            System.out.printf("%s 총점: %d점, 평균: %.1f점\n", names[i], clsScore[i]
                    , (float) clsScore[i] / names.length);
        }
    }
}
