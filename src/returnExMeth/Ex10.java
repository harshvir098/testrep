package returnExMeth;

public class Ex10 {
    public static void main(String[] args) {
        Ex10 x= new Ex10();

        String val= x.testLogicalOr(20);
        System.out.println(val);

    }

    public String testLogicalOr(int val) {
        if (val>=10 && val <=20 ) { // Cambia esta línea
            return "Inside";
        }else {
            return "Outside";
        }
    }
}
