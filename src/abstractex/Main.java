package abstractex;

public class Main {
    public static void main(String[] args) {

        Vaca vaca = new Vaca("muuuuuu");
        Cerdo cerdo = new Cerdo("oinkoink");
        Gallina gallina = new Gallina("kokoroko");
        Granjero g=new Granjero();


        vaca.comunicarse();
        cerdo.comunicarse();
        gallina.comunicarse();
        g.comunicarse();
    }
}
