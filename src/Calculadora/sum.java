package Calculadora;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        while (true) {

            System.out.println("SUM");
            Scanner scanner = new Scanner(System.in);
            try {

                System.out.print("Enter 1st num :");
                 int a = scanner.nextInt();

                System.out.print("Enter 2nt num :");
                int b = scanner.nextInt();

                System.out.println("Sum :" + (a+b));


            }

            catch (Exception e){

                System.out.println("Enter coreect value");
            }

        }
    }
}
