package whileloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws IOException {

        boolean condicones = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        while (!condicones) {

            try {
                System.out.println("Enter number to counts and  -1 to exit the code:  ");
                int num = Integer.parseInt(br.readLine());

                if (num == -1) {
                    System.out.println("exiting");
                    condicones = true;
                } else {
                    count++;

                }

            } catch (Exception e) {
                System.out.println("error");
            }


        }
        System.out.println(count++);
    }
}
