package returnExMeth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex5 {
    public static void main(String[] args) {

        Ex5 x = new Ex5();
        boolean con = false;
        while (!con) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter name: ");

               String nn= x.saludar(br.readLine());
                System.out.println(nn);

            } catch (Exception e) {
                System.out.println("Please enter correct value");
            }


        }
    }


    public String saludar(String name) {


        return "Hola " + name + "!";


    }
}
