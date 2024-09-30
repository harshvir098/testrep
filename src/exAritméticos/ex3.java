package exAritméticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            try {
                System.out.println(" entre number for double and triple : ");


                int valor = Integer.parseInt(br.readLine());

                int doub = valor * 2;
                int trip = valor * 3;

                System.out.println("double: " + doub + ", triple :" + trip);

            } catch (Exception e) {

                System.out.println("enetr correct ");
            }
        }
    }
}
