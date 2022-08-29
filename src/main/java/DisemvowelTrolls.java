import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        String[] words = str.split("");

        ArrayList<String> newArrayList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            newArrayList.add(words[i]);
        }
        for (int i = 0; i < newArrayList.size(); i++) {

            if (newArrayList.get(i).toUpperCase().contains("a".toUpperCase()) ||
                    newArrayList.get(i).toUpperCase().contains("e".toUpperCase()) ||
                    newArrayList.get(i).toUpperCase().contains("i".toUpperCase()) ||
                    newArrayList.get(i).toUpperCase().contains("o".toUpperCase()) ||
                    newArrayList.get(i).toUpperCase().contains("u".toUpperCase())
            ) {
                newArrayList.remove(newArrayList.get(i));
            }
        }
        String phrase = String.join(" ", newArrayList);

        System.out.println("Los trolls hablan así: " + phrase);

        return str;
    }
}