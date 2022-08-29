import java.util.ArrayList;
import java.util.Arrays;

public class Accumul {
    public static String accum(String s) {
        int contador = 0;
        String[] accumArray = s.split("");
        ArrayList<String> accumArrayList = new ArrayList<>();
        ArrayList<String> letraArrayList = new ArrayList<>();

        for (int i = 0; i < accumArray.length; i++) {
            accumArrayList.add(accumArray[i]);
        }

        for (int i = 0; i < accumArrayList.size(); i++) {

            String letra;
            letra = String.valueOf(accumArrayList.get(i).toUpperCase());
            letraArrayList.add((letra.toUpperCase()+(letra.repeat(contador).toLowerCase())));
            contador++;
        }
        String phrase = String.join("-", letraArrayList);

        System.out.println(phrase);

        return s;
    }
}