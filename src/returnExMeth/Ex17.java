package returnExMeth;

import methods.Meth3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex17 {
    public static void main(String[] args) {

        Ex17 m = new Ex17();

        boolean con = false;
        while (!con) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter value: ");

               String val= m.testSize(Integer.parseInt(br.readLine()));
                System.out.println(val);

            } catch (Exception e) {
                System.out.println("Please enter correct value");
            }


        }
    }

    public String testSize(int num) {
        if(num < 5)return "Tiny";
        else if(num < 10)return "Small";
        else if (num < 15) return "Medium";
        else if (num < 20) return "Large";
        else return "Huge";
    }
}