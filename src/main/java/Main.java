public class Main {
    public static void main(String[] args) {
        callMethod();
    }

    public static void callMethod(){
        System.out.println("Primer ejercicio: \n");
        JadenCase phrase = new JadenCase();
        JadenCase.toJadenCase("Most Trees Are Blue");

        System.out.println("\nSegundo ejercicio: \n");
        DisemvowelTrolls example= new DisemvowelTrolls();
        DisemvowelTrolls.disemvowel("This website is for losers LOL!");

    }
}
