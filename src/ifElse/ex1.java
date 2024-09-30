package ifElse;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {



        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("whats the grade: ");
                int grade = scanner.nextInt();

                if (grade > 5) {
                    System.out.println("approved");
                } else if (grade == 5) {
                    System.out.println("Narrowly approved");
                } else System.out.println("Fail");
            }

            catch (Exception e){

                System.out.println("Enter coreect value");
            }

        }
    }
}
