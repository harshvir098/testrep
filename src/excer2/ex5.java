package excer2;

public class ex5 {
    public static void main(String[] args) {


        float centigrados= 20f;
        float fahrenheit= ( (centigrados *9/5) + 32);       // Hay que modificar esta línea
        System.out.println(fahrenheit); // Debería mostrar 68



        String nombre = "Juan";
        String material = "madera";
        String dimensiones = "diminutas";
        String comentario = "Que sea bonita, pero de una belleza estraña, indómita";

        System.out.println( nombre+" ha pedido una caja de "+ material+ " con unas dimensiones " + dimensiones+". "+ comentario+".");
    }
}
