package inherex2;

class Vaca extends Animal {
    public Vaca(String sonido) {
        super(sonido);
    }

    @Override
    public void comunicarse() {
        System.out.println("Cuando la vaca tiene leche hace " + sonido);
    }

}