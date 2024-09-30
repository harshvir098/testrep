package returnExMeth;

public class Ex7 {

    public static void main(String[] args) {

        Ex7 x= new Ex7();

        String val= x.testGreaterOrEqual(50);
        System.out.println(val);
    }


    public String testGreaterOrEqual(int val) {
        if (val>=20) {  // Cambia esta línea
            return "20 or más";
        }

        if (val>=10) {  // Cambia esta línea
            return "10 o más";
        }

        return "menos de 10";
    }
}
