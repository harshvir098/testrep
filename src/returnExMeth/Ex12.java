package returnExMeth;

public class Ex12 {

    public static void main(String[] args) {

        Ex12 x= new Ex12();

        String val= x.testElse(12);
        System.out.println(val);

    }

    public String testElse(int val) {
        String result = "";

        if (val > 5) {
            result = "Mayor que 5";
        } else {
            result = "5 más pequeño";
        }

        return result;
    }
}
