package returnExMeth;

public class Ex19 {
    public static void main(String[] args) {

        Ex19 m = new Ex19();

        Boolean val= m.nand(false, false);
        System.out.println(val);

        Boolean val2= m.nand(true, false);
        System.out.println(val2);

        Boolean val3=m.nand(false, true);

        System.out.println(val3);
        boolean val4= m.nand(true, true);
        System.out.println(val4);


    }


    public boolean nand(boolean a, boolean b) {

        if (!(a && b)){

            return false;} else return true;

    }


}
