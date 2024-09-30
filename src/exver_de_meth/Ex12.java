package exver_de_meth;

public class Ex12 {

    public static void main(String[] args) {

        Ex12 m = new Ex12();

        System.out.println(m.tieneLetra("hehas", "s"));
    }

    public boolean tieneLetra(String a, String ch) {

        if (a.toUpperCase().indexOf(ch.toUpperCase())>=0){
            return true;
        } else return false;

    }
}
