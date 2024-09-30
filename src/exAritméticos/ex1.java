package exAritméticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while ( true) {

            try {
                System.out.println(" un conversor de euros a dólares : ");
                int valor = Integer.parseInt(br.readLine());

                int converted = 2 * valor;

                System.out.println("valor es : " + converted);
            } catch ( Exception e){

                System.out.println("enetr correct num");
            }

        }

    }
}
