package returnExMeth;

public class Ex16 {

    public static void main(String[] args) {

        Ex16 x= new Ex16();

        String val= x.orderMyLogic(12);
        System.out.println(val);

    }
    public String orderMyLogic(int val) {
        if (val < 5) {
            return "Menos que 5";
        } else if (val < 10) {
            return "Menos que 10";
        } else {
            return "Mayor o igual a 10";
        }
    }

}
