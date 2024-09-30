package equalEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        Ex d1 = new Ex("d1",8, 2, 3);
        Ex d2 = new Ex("d2",3, 2, 5);
        Ex d3 = new Ex("d3",3, 2, 6);
        Ex d4 = new Ex("d4",4, 2, 7);
        Ex d5 = new Ex("d5",3, 2, 9);

        if (d1.equals(d2)) System.out.println("exito1");
        if (d2.equals(d1)) System.out.println("exito2");

        ArrayList<Ex> depots = new ArrayList<>();
        depots.add(d3);
        depots.add(d5);
        depots.add(d1);
        depots.add(d4);
        depots.add(d2);

        Collections.sort(depots);

        Iterator<Ex> iterator = depots.iterator();
        while (iterator.hasNext()) {
            Ex deposito = iterator.next();
            System.out.println( deposito.getNombre() +" "+deposito.calcularVolumen());
        }

    }
}
