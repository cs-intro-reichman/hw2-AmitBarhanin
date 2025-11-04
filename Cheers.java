
public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int nTimes = Integer.parseInt(args[1]);
                char[] wordArr = word.toCharArray();
                for (int i = 0; i < wordArr.length; i++) {
                        String anOrA = "a";
                        switch (wordArr[i]) {
                                case 'A':
                                        anOrA = "an";
                                        break;
                                case 'E':
                                        anOrA = "an";
                                        break;
                                case 'F':
                                        anOrA = "an";
                                        break;
                                case 'H':
                                        anOrA = "an";
                                        break;
                                case 'I':
                                        anOrA = "an";
                                        break;
                                case 'L':
                                        anOrA = "an";
                                        break;
                                case 'M':
                                        anOrA = "an";
                                        break;
                                case 'N':
                                        anOrA = "an";
                                        break;
                                case 'O':
                                        anOrA = "an";
                                        break;
                                case 'R':
                                        anOrA = "an";
                                        break;
                                case 'S':
                                        anOrA = "an";
                                        break;
                                case 'X':
                                        anOrA = "an";
                                        break;
                        }
                        System.out.println("Give me " + anOrA + " " + wordArr[i] + ": " + wordArr[i] + "!");

                }
                System.out.println("What does that spell?");
                for (int i = 0; i < nTimes; i++) {
                        System.out.println(word + "!!!");
                }

        }
}
