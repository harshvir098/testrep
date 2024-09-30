package review_ques;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DniLetra {
    public static void main(String[] args) {

        DniLetra n= new DniLetra();

        int shouldhave= 8;
        boolean cond= false;


        while (!cond ){
            try {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Intruzca DNI sin letra: ");
                String a = br.readLine();

                if(a.length()==8){

                    System.out.println(n.generar(a));

                } else System.out.println("enter correct value (should  have 8 num)");
            } catch (Exception e){
                System.out.println("error");
            }


        }
        }

        public String generar(String dni){
            int al= Integer.parseInt(dni);
            String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
            int guardar= al%23;

            return String.valueOf(letras.charAt(guardar));
        }

}
