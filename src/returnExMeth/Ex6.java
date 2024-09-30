package returnExMeth;

public class Ex6 {

    public static void main(String[] args) {

        Ex6 x =new Ex6();

       String val= x.testGreaterThan(20);
        System.out.println(val);

    }

    public String testGreaterThan(int val) {
        if (val>100) {  // Cambia esta línea
            return "Por encima de 100";
        }

        if (val>10) {  // Cambia esta línea
            return "Por encima de 10";
        }

        return "10 o menos";
    }
}
