package inherex2;

abstract class Animal {
     String sonido;

    public Animal(String sonido) {
        this.sonido = sonido;
    }

    public abstract void comunicarse();
}
