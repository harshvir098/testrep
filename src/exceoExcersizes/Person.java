package exceoExcersizes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

public class Person {

    String dni;
    String nombre;

    Date fecahaNacimeinto;

    public Person(String dni, String nombre, Date fecahaNacimeinto) {
        this.dni = dni;
        this.nombre = nombre;
        this.fecahaNacimeinto = fecahaNacimeinto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecahaNacimeinto() {
        return fecahaNacimeinto;
    }

    public void setFecahaNacimeinto(Date fecahaNacimeinto) {
        this.fecahaNacimeinto = fecahaNacimeinto;
    }
}
