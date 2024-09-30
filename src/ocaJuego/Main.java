package ocaJuego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

    static HashMap<Integer, Integer> ocas;
    static HashMap<Integer, Integer> puentes;
    static HashMap<Integer, Integer> dados;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of player");
        int numPlayer = Integer.parseInt(br.readLine());

        boolean juegoActive=true;

        ocas = getOcas();
        puentes = getPuentes();
        dados = getDados();
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        for (int i = 0; i < numPlayer; i++) {
            System.out.println("Enter name of player");

            String nom = br.readLine();
            Jugador j = new Jugador();
            j.setNombre(nom);
            jugadores.add(j);

        }



        while (juegoActive){

            for(Jugador j:jugadores){
                if(j.isActivo()){
                    System.out.println("Player: "+ j.getNombre());

                    if(j.getTurnosRestantes()==0){
                      int n= tirarDado();

                      int newPosition=n+ j.getCasilla();
                         int casilla=calculatePosition(newPosition,j);

                         if(casilla==-1){
                             juegoActive=false;
                         } else {
                             j.setCasilla(casilla);}

                    }
                } else{

                    System.out.println(j.getNombre()+ "tiene ques esperar "+ j.getTurnosRestantes());
              j.setTurnosRestantes(j.getTurnosRestantes()-1);
                }

            }
        }


    }

    static int calculatePosition(int newPosition, Jugador j){

        Integer casillaDestino = ocas.get(newPosition);
        Integer casillaDestino2 = puentes.get(newPosition);
        Integer casillaDestino3 = dados.get(newPosition);

        if (casillaDestino != null) {
            System.out.println("De oca a oca y tiro porque me toca " + j.getCasilla());
            int n = tirarDado();
            return calculatePosition(casillaDestino + n, j);
        } else if (newPosition == 19) {
            j.setTurnosRestantes(2);
        } else if (newPosition == 3) {
            j.setTurnosRestantes(1);
        } else if (newPosition == 52) {
            j.setTurnosRestantes(3);
        } else if (casillaDestino2 != null) {
            System.out.println("De puente a puente y tiro porque me lleva la corriente "+ j.getCasilla());
            int n = tirarDado();
            return calculatePosition(casillaDestino2 + n, j);
        } else if (casillaDestino3 != null) {
            System.out.println("De dado a dado y tiro porque me ha tocado "+j.getCasilla());
            int n = tirarDado();
            return calculatePosition(casillaDestino3 + n, j);
        } else if (newPosition == 58) {
            System.out.println("El jugador " + j.getNombre() + " nos ha dejado "+j.getCasilla());
            j.setActivo(false);
        }else if( newPosition == 63) {
            System.out.println("El jugador " + j.getNombre() + " ha ganado "+j.getCasilla());
            return -1;
        }else if(newPosition >63) {
            int diff = newPosition -63;
            return calculatePosition(63 - diff, j);
        }

        return newPosition;
    }

    static HashMap<Integer, Integer> getOcas() {
        HashMap<Integer, Integer> ocas = new HashMap<Integer, Integer>();
        ocas.put(5, 9);
        ocas.put(9, 14);
        ocas.put(14, 18);
        ocas.put(18, 23);
        ocas.put(23, 27);
        ocas.put(27, 32);
        ocas.put(32, 36);
        ocas.put(36, 41);
        ocas.put(41, 45);
        ocas.put(45, 50);
        ocas.put(50, 54);
        ocas.put(54, 59);

        return ocas;
    }

    static HashMap<Integer, Integer> getPuentes() {
        HashMap<Integer, Integer> puentes = new HashMap<Integer, Integer>();
        puentes.put(6, 12);
        puentes.put(12, 6);
        return puentes;
    }

    static HashMap<Integer, Integer> getDados() {
        HashMap<Integer, Integer> dados = new HashMap<Integer, Integer>();
        dados.put(26, 53);
        dados.put(53, 26);
        return dados;
    }

    static int tirarDado() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }


}
