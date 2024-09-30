package exver_de_meth;

public class Ex10 {

    public static void main(String[] args) {

        Ex10 m = new Ex10();
        m.generarNombre2("hehar", "shv0shv", "rsaair:");
    }

    public void generarNombre2(String a, String b, String c) {

        if (a.length() < 5 || b.length() < 5 || c.length() < 5) {

            System.out.println("error");
        } else {

            String str1 = a.substring(a.length() - 3);
            String str2 = b.substring(b.length() - 3);
            String str3 = c.substring(c.length() - 3);

            System.out.println("New word  : " + str1 + str2 + str3);


        }
    }
}
