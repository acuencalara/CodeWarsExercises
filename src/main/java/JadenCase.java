import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        String[] words = phrase.split(" ");

        ArrayList<String> phraseArrayList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String newWord = words[i].replace(words[i].charAt(0), words[i].toUpperCase().charAt(0));
            phraseArrayList.add(newWord);
        }
        StringBuilder phraseModified = new StringBuilder();

        for (String phrase2 : phraseArrayList) {
            phraseModified.append(phrase2);
            phraseModified.append(" ");
        }

        System.out.println(phraseModified);

        return phrase;
    }
}
