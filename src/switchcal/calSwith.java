package switchcal;

import java.util.Scanner;

public class calSwith {
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


                switch (op) {
                    case "+":
                        System.out.println("Sum: " + (a + b));
                        break;
                    case "-":
                        System.out.println("minus: " + (a - b));
                        break;
                    case "*":
                        System.out.println("Multiple: " + (a * b));
                        break;
                    case "/":
                        System.out.println("divide: " + (a / b));
                        break;
                }
            } catch (Exception e){

                System.out.println("Enter correct value(Num)");
            }




        }


    }
}
