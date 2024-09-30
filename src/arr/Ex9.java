package arr;

public class Ex9 {
    public static void main(String[] args) {
        int[] numbers = new int[6];

        int value = 5;
        int index = 0;

        while (value >= 0) {
            numbers[index] = value;
            value--;
            index++;
        }

        for (int i=0;i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
