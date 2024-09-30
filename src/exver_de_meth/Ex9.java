package exver_de_meth;

public class Ex9 {

    public static void main(String[] args) {

        Ex9 m = new Ex9();
        m.generarNombre2("hhhhhh", "shv000a", "rsaaaaar");
    }

    public void generarNombre2(String a, String b, String c) {

        if (a.length()<5 || b.length() <5 || c.length()<5){

            System.out.println("error");
        }
        else {

            String str1= a.substring(a.length()-1);
            String str2= b.substring(b.length()-1);
            String str3= c.substring(c.length()-1);

            System.out.println("New word  : " + str1+str2+str3);



        }

    }
}
