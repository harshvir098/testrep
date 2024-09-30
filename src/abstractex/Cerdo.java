package abstractex;

class Cerdo extends Animal {
    public Cerdo(String sonido) {
        super(sonido);
    }

    @Override
    public void comunicarse() {
        System.out.println("Cuando el cerdo tiene hambre hace " + sonido);
    }
}