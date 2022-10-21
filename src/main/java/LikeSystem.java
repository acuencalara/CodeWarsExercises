import java.util.Arrays;

public class LikeSystem {
    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0:
                System.out.println("no one likes this");
                return "no one likes this";
            case 1:
                System.out.println(names[0] + " likes this");
                return names[0] + " likes this";
            case 2:
                System.out.println(names[0] + " and " + names[1] + " like this");
                return names[0] + " and " + names[1] + " like this";
            case 3:
                System.out.println(names[0] + ", " + names[1] + " and " + names[2] + " like this");
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                System.out.println(names[0] + ", " + names[1] + " and " + Integer.toString((names.length) - 2) + " others like this");
                return names[0] + ", " + names[1] + " and " + Integer.toString((names.length) - 2) + " others like this";
        }
    }
}
