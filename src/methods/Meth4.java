package methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Meth4 {
    public static void main(String[] args) {

        Meth4 m=new Meth4();
        boolean con = false;
        while (!con) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter length: ");
                int a=Integer.parseInt(br.readLine());

                System.out.print("Enter width: ");
                int b=Integer.parseInt(br.readLine());


                m.para(a, b);


            } catch (Exception e) {
                System.out.println("Please enter correct value");
            }


        }
    }



    public void para(int lenght, int width) {

        int a = 2*(lenght*width);

        System.out.println("area is :" + a);


    }
}
