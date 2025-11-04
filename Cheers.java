
public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int nTimes = Integer.parseInt(args[1]);
               // char[] wordArr = word.toCharArray();
                for (int i = 0; i < word.length(); i++) {
                        String anOrA = "a ";
                        String anLetters = "AEFHILMNORSX";
                        char letter = word.charAt(i);
                     if (anLetters.indexOf(letter) != -1) {
                        anOrA = "an";
                     }
                        System.out.println("Give me " + anOrA + " " + letter + ": " + letter + "!");

                }
                System.out.println("What does that spell?");
                for (int i = 0; i < nTimes; i++) {
                        System.out.println(word + "!!!");
                }

        }
}
