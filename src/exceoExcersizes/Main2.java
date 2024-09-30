package exceoExcersizes;

import herencia.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) throws ParseException, SinDatosException {



        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // MM debe estar en mayúscula, las minúsculas son para minutos.
        Date fecha1 = formatter.parse("10-11-2021");
        Date fecha2 = formatter.parse("10-11-2002");

        Person p1=new Person("12344","harsh",fecha1);
        Person p2=new Person("124","harsh2",fecha2);

        HashMap<String,Person> personas= new HashMap<>();

        personas.put(p1.getDni(), p1);
        personas.put(p2.getDni(), p2);

        Servicios s=new Servicios();
        Person p= s.getElderlyPerson(personas);
        System.out.println("age of "+ p.getNombre() +" is more ");

    }
}
