package arr;

public class Ex10 {
    public static void main(String[] args) {
        int[] numbers = new int[6];

        for (int i = 5; i >= 0; i--) {
            numbers[5 - i] = i;
        }

        for (int i=0;i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }


}
