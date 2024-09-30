package review_ques;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SecretNumber {
    static SecretNumber s = new SecretNumber();

    public static void main(String[] args) {

        boolean aa=true;
        while (aa) {
            int attempt = 3;
            boolean con = false;
            int secret = (int) (Math.floor(Math.random() * 5) + 1);

            System.out.println("Enter a number between 1 to 5: You have 3 attempts to guess.");

            while (!con && attempt > 0) {
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    int a = Integer.parseInt(br.readLine());

                    if (a >= 1 && a <= 5) {
                        con = matchNumber(secret, a);

                            attempt--;

                            System.out.println("Number of attempts left: " + attempt);


                    } else {
                        System.out.println("Please enter a valid number between 1 and 5.");
                    }

                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                }
            }

            if (!con) {
                System.out.println("Sorry, you've used all your attempts. The secret number was: " + secret);
            }
        }

    }





    public static boolean matchNumber(int secret, int numUser) {
        if (numUser == secret) {
            System.out.println("Congratulations! You guessed the secret number: " + secret);
            return true;
        } else {
            System.out.println("Wrong guess! Try again.");
            return false;
        }
    }


}
