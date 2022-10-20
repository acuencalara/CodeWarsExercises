import java.sql.Array;
import java.util.Arrays;
import java.util.OptionalDouble;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {

        int[] arrayScores = new int[3];
        arrayScores[0] = s1;
        arrayScores[1] = s2;
        arrayScores[2] = s3;

        OptionalDouble avg = Arrays.stream(arrayScores).average();

        char score = 0;

        if ((avg.getAsDouble() >= 90) && (avg.getAsDouble() <= 100)) {
            score = 'A';
            System.out.println(score);
            return score;
        } else if ((avg.getAsDouble() >= 80) && (avg.getAsDouble() < 90)) {
            score = 'B';
            System.out.println(score);
            return score;
        } else if ((avg.getAsDouble() >= 70) && (avg.getAsDouble() < 80)) {
            score = 'C';
            System.out.println(score);
            return score;
        } else if ((avg.getAsDouble() >= 60) && (avg.getAsDouble() < 70)) {
            score = 'D';
            System.out.println(score);
            return score;
        } else if ((avg.getAsDouble() < 60)) {
            score = 'E';
            System.out.println(score);
            return score;
        }
        return score;
    }
}
