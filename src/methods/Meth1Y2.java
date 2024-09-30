package methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Meth1Y2 {
    public static void main(String[] args) throws IOException {
        Meth1Y2 ex = new Meth1Y2();

        ex.check(true);

        boolean con = false;
        while (!con){

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter num for cube: ");

                ex.num(Integer.parseInt(br.readLine()));


            } catch (Exception e){
                System.out.println("Please enter correct value");
            }


        }
    }

    public void check(boolean valor){
        if (valor) {
            System.out.println("the value is true");

        }else System.out.println("the value is false");
    }


    public void num(int n) throws IOException {

        n=n*n*n;
        System.out.println("Cube: "+ n);

    }

}
