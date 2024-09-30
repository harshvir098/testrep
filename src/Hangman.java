import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Hangman {

    public static void main(String[] args) throws IOException {
        Hangman h = new Hangman();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String secretWord = h.secrectWord();
        char[] wordDashes = h.getdash(secretWord);
        int attempts = 3;
        boolean gameWon = false;

        while (attempts > 0 && !gameWon) {
            System.out.println("Current word: " + Arrays.toString(wordDashes));
            System.out.println("Attempts remaining: " + attempts);
            System.out.print("Guess a letter: ");
            char guessedLetter = br.readLine().charAt(0);

            boolean correctGuess = false;

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guessedLetter) {
                    wordDashes[i] = guessedLetter;
                    correctGuess = true;
                 }

            }

            if (!correctGuess) {
                attempts--;
                System.out.println("Incorrect guess.");
            } else {
                System.out.println("Correct guess!");
            }

            if (new String(wordDashes).equals(secretWord)) {
                gameWon = true;
                System.out.println("Congratulations! You've guessed the word: " + secretWord);
            }
        }

        if (!gameWon) {
            System.out.println("Game over. The secret word was: " + secretWord);
        }
    }

    public String secrectWord() {
        String[] secWord = {"word", "paper", "bottle"};
        Random r = new Random();
        int n = r.nextInt(secWord.length);
        return secWord[n];
    }

    public char[] getdash(String word) {
        int n = word.length();
        char[] wordDsh = new char[n];
        for (int i = 0; i < n; i++) {
            wordDsh[i] = '_';
        }
        return wordDsh;
    }

}
