package exceoExcersizes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, PrecioDemasiadoAltoException {




            while (true) {
                try {
                    double result = getPrecioConIva();
                    System.out.println("Value with VAT: " + result);
                } catch (PrecioDemasiadoAltoException e) {
                    System.err.println(e.getMessage());
                }
            }
        }





    public static double getPrecioConIva() throws IOException, PrecioDemasiadoAltoException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double iva;
        boolean cond = false;


            System.out.println("Enter your number: ");
            iva = Integer.parseInt(br.readLine());


        if (iva > 100) {
            throw new PrecioDemasiadoAltoException("The price " + iva + ") is too high.");
        }
            iva = iva * 1.16;


        return iva;
    }
}
