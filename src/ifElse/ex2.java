package ifElse;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        while (true) {


            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter the value: ");
                int num = scanner.nextInt();

                if((num>=0) ){
                    System.out.println("positive");
                } else System.out.println("negative");

                if (num%2==0) {
                    System.out.println("Even");
                } else System.out.println("Odd");


                if (num%5==0) {
                    System.out.println("numtiple of 5");
                } else System.out.println("not a multiple of 5");


                if (num%10==0) {
                    System.out.println("numtiple of 10");
                } else System.out.println("not a multiple of 10");



                if(num>=100){
                    System.out.println("greater than 100");

                } else System.out.println("less than 100");


            }


            catch (Exception e){

                System.out.println("Enter coreect value");
            }

        }
    }
}
