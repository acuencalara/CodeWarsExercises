import java.util.Arrays;
import java.util.OptionalDouble;

public class BetterThanAverage {
    public static <Int> boolean betterThan(int[] classPoints, int yourPoints) {

       int total= Arrays.stream(classPoints).sum();
       int totalNumbers=classPoints.length;

       int avg=total/totalNumbers;

       if(yourPoints<avg){
           System.out.println("Your score is "+yourPoints+"! You are below the average");
           return false;
       } else {
           System.out.println("Your score is "+yourPoints+"! You are better than the average");
           return true;
       }
    }
}
