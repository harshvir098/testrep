package aleatorios;



public class ex2 {
    public static void main(String[] args) {
        String nom="HARSHVIR";

        double v= Math.floor(Math.random() * nom.length());

        System.out.println(nom.charAt((int) v));
    }
}
