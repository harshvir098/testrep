package exAritméticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5 {

    public static void main(String[] args) throws IOException {
        while (true){

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("conversor de grados centígrados a grados Fahrenheit: ");

                float centigrados= Float.parseFloat(br.readLine());
                float fahrenheit= ( (centigrados *9/5) + 32);       // Hay que modificar esta línea
                System.out.println(fahrenheit);
            } catch (Exception e) {

                System.out.println("enetr correct");
            }

        }


    }
}
