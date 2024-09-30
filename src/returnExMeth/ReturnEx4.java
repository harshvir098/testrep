package returnExMeth;

public class ReturnEx4 {
    public String echo(String phrase) {
        return phrase;
    }

    public static void main(String[] args) {
        ReturnEx4 m = new ReturnEx4();
        String x = m.echo("Greta");
        System.out.println(x);
        String oth = m.echo("CO2");
        System.out.println(oth);


    }
}
