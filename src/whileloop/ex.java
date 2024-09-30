package whileloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean condicion=false;
        while (condicion==false) {

            System.out.print("introduce tu nombre: ");
            String nom = br.readLine();
           if (!nom.equals("")){

            System.out.println("Son correctos estos datos?");

            String comfirmation= br.readLine();

            if (comfirmation.equals("yes")) {

                System.out.println("finalizado paso");
           condicion =true;

            } else System.out.println("error");

        }
    }
    }
}
