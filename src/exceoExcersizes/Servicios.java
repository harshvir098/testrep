package exceoExcersizes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Servicios {

public Person getElderlyPerson(Map<String,Person> personas) throws SinDatosException {

    if(personas.isEmpty()){
    throw new SinDatosException("Its empty");
    }

    Collection<Person> coleccionPersonas = personas.values();
    List<Person> listaPersonas = new ArrayList<>(coleccionPersonas);
    Person findOldPerson=listaPersonas.get(0);

    for (Person p :listaPersonas){
        if (p.getFecahaNacimeinto().before(findOldPerson.getFecahaNacimeinto()) ){
            findOldPerson=p;
        }
    }
    return findOldPerson;

}
}
