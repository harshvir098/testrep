package methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Meth5 {
    public static void main(String[] args) {

        Meth5 m=new Meth5();
        boolean con = false;
        while (!con) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter base: ");
                int a=Integer.parseInt(br.readLine());

                System.out.print("Enter width: ");
                int b=Integer.parseInt(br.readLine());


                m.areaTri(a, b);


            } catch (Exception e) {
                System.out.println("Please enter correct value");
            }


        }
    }



    public void areaTri(int base, int width) {

        int a = (base*width)/2;

        System.out.println("area of triangle :" + a);


    }
}
