package Calculadora;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator");


        while (true) {

            try {
                System.out.print("Enter 1st num :");
                int a = scanner.nextInt();

                System.out.print("Enter 2nt num :");
                int b = scanner.nextInt();


                System.out.print("What opration you want to do: +, –, * y : ");
                String op = scanner.next();

                if (op.equals("+")) {
                    System.out.println("Sum: " + (a + b));
                } else if (op.equals("-")) {

                    System.out.println("minus: " + (a - b));

                } else if (op.equals("*")) {
                    System.out.println("Multiple: " + (a * b));
                } else if (op.equals("/")) {
                    System.out.println("divide: " + (a / b));
                }
            } catch (Exception e){

                System.out.println("Enter correct value(Num)");
            }




        }


    }
    }



