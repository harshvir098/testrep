package methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Meth3 {
    public static void main(String[] args) {

        Meth3 m = new Meth3();

        boolean con = false;
        while (!con) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter your speed in Km/hour to convert in m/h: ");

                m.speed(Integer.parseInt(br.readLine()));


            } catch (Exception e) {
                System.out.println("Please enter correct value");
            }


        }
    }


    public void speed(int sp) {

        sp = sp * 1000;
        System.out.println("Speed in m/h is: " + sp);


    }
}
