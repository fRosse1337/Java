import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Java_lesson3 {

    public static void main(String[] args) throws IOException {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
                "potato"};
        System.out.println(Arrays.toString(words));
        String guess = getRandomWord(words);
        String maskedGuess = maskWord(guess);
        System.out.println("Угадай слово! ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String myWord = br.readLine();
            myWord = maskWord(myWord);
            if (maskedGuess.equals(myWord)) {
                System.out.println("Вы выйграли!" + myWord);
                break;
            } else {
                String maskedResult = "";
                for (int i = 0; i < maskedGuess.length() - 1; i++) {
                    if (maskedGuess.charAt(i) == myWord.charAt(i)) maskedResult += maskedGuess.charAt(i);
                    else maskedResult += "#";
                }
                System.out.println(maskedResult);
                System.out.println("Неправильно! Попробуйте еще раз. ");
            }
        }
    }

    static String getRandomWord(String[] s) {
        Random random = new Random();
        return s[random.nextInt(s.length - 1)];
    }

    static String maskWord(String s) {
        String mask = "################";
        for (int i = s.length() - 1; i < mask.length() - 1; i++) {
            s += mask.charAt(i);
        }
        return s;
    }
}
