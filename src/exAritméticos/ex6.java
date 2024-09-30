package exAritméticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex6 {
    public static void main(String[] args) throws IOException {


        while ( true) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter nombre: ");
                String nombre = br.readLine();

                System.out.println("enter material: ");
                String material = br.readLine();

                System.out.println("enter dimensiones: ");
                String dimensiones = br.readLine();

                System.out.println("enter comentario: ");
                String comentario = br.readLine();

                System.out.println(nombre + " ha pedido una caja de " + material + " con unas dimensiones " + dimensiones + ". " + comentario + ".");

            } catch (Exception e){
                System.out.println("enter corect value");
            }
        }

    }
}
