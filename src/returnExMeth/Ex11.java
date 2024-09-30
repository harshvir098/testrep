package returnExMeth;

public class Ex11 {

    public static void main(String[] args) {
        Ex11 x= new Ex11();

        String val= x.testEqual(12);
        System.out.println(val);

    }

    public String testEqual(int val) {
        if (val==12) { // Cambia esta línea
            return "Equal";
        }
        return "Not Equal";
    }

}
