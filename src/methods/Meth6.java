package methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Math.PI;

public class Meth6 {

    public static void main(String[] args) {

        Meth6 m=new Meth6();
        boolean con = false;
        while (!con) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter radio: ");
                int a=Integer.parseInt(br.readLine());




                m.para(a);
                m.area(a);

            } catch (Exception e) {
                System.out.println("Please enter correct value");
            }


        }
    }



    public void para(int radio){

        int a = (int) (2*PI*radio);

        System.out.println("Perímetro de la circunferencia" + a);


    }

    public void area(int radio) {

        int a = (int) (PI*(radio*radio));

        System.out.println("area de la circunferencia" + a);


    }
}
