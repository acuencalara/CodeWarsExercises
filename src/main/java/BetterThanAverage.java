import java.util.Arrays;
import java.util.OptionalDouble;

public class BetterThanAverage {
    public static boolean betterThan(int[] classPoints, int yourPoints) {
       OptionalDouble avg = Arrays.stream(classPoints).average();
       Double average= avg.getAsDouble();

       if(yourPoints<average){
           System.out.println("Your score is"+yourPoints+" You are below the average");
           return false;
       } else {
           System.out.println("Your score is"+yourPoints+" You are better than the average");
           return true;
       }
    }
}
