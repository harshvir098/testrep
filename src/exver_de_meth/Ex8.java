package exver_de_meth;

public class Ex8 {

    public static void main(String[] args) {

        Ex8 m = new Ex8();
        m.generarNombre("hhh", "shv0000", "ir:ars");
    }

    public void generarNombre(String a, String b, String c) {

       if (a.length()<5 || b.length() <5 || c.length()<5){

           System.out.println("error");
       }
       else {

       String str1= a.substring(0, 3);
           String str2= b.substring(0, 3);
           String str3= c.substring(0, 3);

           System.out.println("New word  : " + str1+str2+str3);



       }

    }
}
