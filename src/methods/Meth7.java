package methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Meth7 {

    public static void main(String[] args) {

        Meth7 m = new Meth7();
        boolean con = false;

        while (!con) {

            Scanner scanner = new Scanner(System.in);


            try {
                System.out.print("Enter 1st num :");
                int a = scanner.nextInt();

                System.out.print("Enter 2nt num :");
                int b = scanner.nextInt();


                System.out.print("What opration you want to do: +, –, *, /  : ");
                String op = scanner.next();


                switch (op) {
                    case "+":
                        m.sum(a,b);
                        break;
                    case "-":
                        m.minus(a,b);
                        break;
                    case "*":
                        m.mult(a,b);
                        break;
                    case "/":
                         m.div(a,b);
                        break;
                }
            } catch (Exception e){

                System.out.println("Enter correct value(Num)");
            }

        }
    }


    public void sum(int a, int b) {

        System.out.println("Sum is: " + (a + b));


    }


    public void minus(int a, int b) {

        System.out.println("Minus is: " + (a - b));


    }
    public void mult(int a, int b) {

        System.out.println("multiple is: " + (a * b));

    }

    public void div(int a, int b) {

        System.out.println("divide is: " + (a/b));


    }

}
