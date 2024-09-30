package exver_de_meth;

public class Ex3 {
    public static void main(String[] args) {

        Ex3 m= new Ex3();
        m.devuelveUltimaLetra ("anan");
    }

    public void devuelveUltimaLetra (String para){

        System.out.println(para.charAt(para.length()-1));

    }
}
