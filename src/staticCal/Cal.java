package staticCal;

import java.util.Scanner;

public class Cal {


    public static void main(String[] args) {

        Cal m = new Cal();
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
                        m.sum(a, b);
                        break;
                    case "-":
                        m.minus(a, b);
                        break;
                    case "*":
                        m.mult(a, b);
                        break;
                    case "/":
                        m.div(a, b);
                        break;
                }
            } catch (Exception e) {

                System.out.println("Enter correct value(Num)");
            }

        }
    }


  public static void sum(int a, int b) {

        System.out.println("Sum is: " + (a + b));


    }


   public static void minus(int a, int b) {

        System.out.println("Minus is: " + (a - b));


    }

   public static void mult(int a, int b) {

        System.out.println("multiple is: " + (a * b));

    }

    public static void div(int a, int b) {

        System.out.println("divide is: " + (a / b));


    }

}
