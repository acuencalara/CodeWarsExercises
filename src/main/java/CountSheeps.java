import java.util.ArrayList;

public class CountSheeps {

        public static String countingSheep(int num) {
            String str = null;
            ArrayList<String> arrayListSheep = new ArrayList<>();
            if(num>=0){
                for (int i = 1; i <= num; i++) {
                    str = i + " sheep...";
                    arrayListSheep.add(str);
                }
                String strTwo=String.join(" ",arrayListSheep);
                System.out.println(strTwo);
            }
            return str;
        }
    }

