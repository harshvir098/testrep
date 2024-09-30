package exver_de_meth;

public class Ex11 {
    public static void main(String[] args) {

        Ex11 m = new Ex11();

        System.out.println(m.tieneLetra("hehas", 's'));
    }

    public boolean tieneLetra(String a, char ch) {

        if (a.indexOf(ch)>=0){
            return true;
        } else return false;

    }
}
