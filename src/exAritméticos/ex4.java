package exAritméticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            try {

                System.out.println("ancho : ");


                int ancho = Integer.parseInt(br.readLine());

                System.out.println("alto : ");
                int alto = Integer.parseInt(br.readLine());

                int para = 2 * (ancho + alto);

                int area = alto * ancho;

                System.out.println("parameter : " + para + ". area : " + area);


            } catch (Exception e) {

                System.out.println("enetr correct num");
            }

        }


    }
}
