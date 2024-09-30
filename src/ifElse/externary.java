package ifElse;

import java.util.Scanner;

public class externary {

    public static void main(String[] args) {


        while (true){

            try{
              Scanner scanner = new Scanner(System.in);
                System.out.print("Enterb numebr: ");

                  int b = scanner.nextInt();

        System.out.println((b>=0)?"b es positivo":"b es negativo");

        System.out.println((b%2==0)?"b es even":"b es odd");

    } catch (Exception e){
                System.out.println("Enter correct value");
            }
        }


        }
}
