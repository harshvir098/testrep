package returnExMeth;

public class Ex9 {
    public static void main(String[] args) {
        Ex9 x= new Ex9();

        String val= x.testLessOrEqual(30);
        System.out.println(val);

    }


    public String testLessOrEqual(int val) {
        if (val<=12) {  // Cambia esta línea
            return "Menor o igual a 12";
        }

        if (val<=24) {  // Cambia esta línea
            return "Menor o igual a 24";
        }

        return "More Than 24";
    }
}
