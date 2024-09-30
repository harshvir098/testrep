package returnExMeth;

public class Ex8 {

    public static void main(String[] args) {
        Ex8 x= new Ex8();

        String val= x.testLessThan(30);
        System.out.println(val);
    }

    public String testLessThan(int val) {
        if (val<25) {  // Cambia esta línea
            return "Por debajo de 25";
        }

        if (val<55) {  // Cambia esta línea
            return "Por debajo de 55";
        }

        return "55 o más";
    }
}
