package exver_de_meth;

public class Ex7 {
    public static void main(String[] args) {

        Ex7 m = new Ex7();
        m.devuelveMasLarga2("aa", "Harsh", "hars");
    }

    public void devuelveMasLarga2(String a, String b, String c) {

        if (a.length() > (b.length()) && a.length() > c.length()) {
            System.out.println(a);
        } else if (b.length() > (a.length()) && b.length() > c.length()) {
            System.out.println(b);
        }else if (c.length() > (a.length()) && c.length() > b.length()) {
            System.out.println(c);
        } else{
            System.out.println("Hay al menos dos cadenas iguales.");
        }
    }
}
