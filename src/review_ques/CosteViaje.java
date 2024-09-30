package review_ques;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CosteViaje{

    public static void main (String [] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca un texto, por favor: ");
        System.out.println("Introduzca el numero de noches: ");
        String numNochesTxt= br.readLine();
        int numNoches = Integer.parseInt(numNochesTxt);
        System.out.println("Introduzca el destino: ");
        String destino = br.readLine();

        CosteViaje costeViaje = new CosteViaje();
        int resultado1 = costeViaje.costeHotel(numNoches);
        int resultado2 = costeViaje.costeAvion(destino);
        int resultado3 = costeViaje.costeAlquilerCoche(numNoches);

        int sumaCostes = resultado1 + resultado2 + resultado3;
        System.out.println("Coste total: " + sumaCostes);
    }

    public int costeAvion(String destino) {
        int coste=0;
        if (destino.equals("Oviedo")){
            coste=15;

        } else if (destino.equals("Tokyo")){
            coste=700;
        } else if (destino.equals("Madrid")){
            coste=90;
        }else if (destino.equals("Barcelona")){
            return 90;}
        return coste;
    }

   public  int costeHotel(int numNoches) {


       return numNoches * 140;


   }

   public int costeAlquilerCoche(int dia) {
       int coste =dia*40 ;

       if(dia>=3){
           coste=coste-20;
       } else if (dia>=7){
           coste=coste-50;
       }
    return coste;
   }


}
