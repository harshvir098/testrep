package returnExMeth;

public class Ex13 {

    public static void main(String[] args) {

        Ex12 x= new Ex12();

        String val= x.testElse(12);
        System.out.println(val);

    }

    public String testElse(int val) {
        String result = "";

        if (val > 5) {
            result = "Bigger than 5";
        } else if (val < 5) {
            result = "Smaller than 5";
        } else {
            result = "Equal to 5";
        }

        return result;
    }
}
