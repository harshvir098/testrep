package returnExMeth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex18 {
    public static void main(String[] args) {

        Ex18 m = new Ex18();

       Boolean val= m.nand(true, true);
        System.out.println(val);

        Boolean val2= m.nand(true, false);
        System.out.println(val2);

        Boolean val3=m.nand(false, true);

        System.out.println(val3);


       boolean val4= m.nand(false, false);
        System.out.println(val4);


        }


    public boolean nand(boolean a, boolean b) {

        if (!(a && b)){

            return true;} else return false;

    }
}
