package forex;

public class ex3 {
    public static void main(String[] args) {

        for(int i = 1; i <=20; i++){

            if(i%3==0){
                System.out.println("Fiz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if ( (i%3==0) &&(i%5==0)) {
                System.out.println("FizzBuzz");
            } else System.out.println(i);

        }
    }
}
