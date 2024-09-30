package exAritméticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            try {
                System.out.println(" entre precio : ");

                float precio = Float.parseFloat(br.readLine());

                float precioFinal = precio * 1.21f;// Hay que modificar esta línea
                System.out.println("con iva:  " + precioFinal);

            } catch (Exception e) {

                System.out.println("enetr correct ");
            }
        }
    }
}