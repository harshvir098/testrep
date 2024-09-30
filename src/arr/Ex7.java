package arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean cond = false;

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        while (!cond) {
            System.out.print("Enter month number (1-12): ");

            try {
                int userinput = Integer.parseInt(br.readLine());

                if (userinput >= 1 && userinput <= 12) {
                    String result = months[userinput - 1];
                    System.out.println("Month: " + result);

                } else {
                    System.out.println("Please enter a number between 1 and 12.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a correct num.");
            }
        }
    }
}
