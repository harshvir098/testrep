package herencia;

public class Persona {
    static int herencia=0;

    public Persona() {
        herencia++;
    }
    public void nn() {
        System.out.println(herencia);
    }
}
