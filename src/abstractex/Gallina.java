package abstractex;

class Gallina extends Animal {
    public Gallina(String sonido) {
        super(sonido);
    }

    @Override
    public void comunicarse() {
        System.out.println("Cuando la gallina pone un huevo hace " + sonido);
    }
}