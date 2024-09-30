package exver_de_meth;

public class Ex6 {
    public static void main(String[] args) {

        Ex6 m= new Ex6();
        m.devuelveMasLarga("aa", "Harsh");
    }

    public void devuelveMasLarga (String a,String b){
       if (a.length()>b.length()){
            System.out.println(a+ " word is larger than "+ b);
        } else System.out.println(b);

    }
}
