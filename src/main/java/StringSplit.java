import java.util.Arrays;
import java.util.Spliterator;

public class StringSplit {
    public static String[] solution(String s) {
        String[] arr = s.split("(?<=\\G.{2})");

        if(s.length()%2 == 1)
            arr[arr.length-1] += "_";

        System.out.println(Arrays.toString(arr));

        return arr;
    }
}
