package abstractex;

public class Animal implements  Comunicable {
     String sonido;

    public Animal(String sonido) {
        this.sonido = sonido;
    }

    public void comunicarse() {
        System.out.println("animal sound ");
    }
}
