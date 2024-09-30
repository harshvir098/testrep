package review_ques;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter num for factorail");
        int n=scanner.nextInt();
        int fact=1;

        for (int i=n; i>0;i--){
           fact=fact*i;
        }
        System.out.println(fact);

    }
}
