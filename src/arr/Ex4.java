package arr;

public class Ex4 {
    public static void main(String[] args) {
        Ex4 m = new Ex4();
        int[] valores = {5, 2, 6};
        int result= m.getFirstElement(valores);
        System.out.println(result);

    }

    public int getFirstElement(int[] num) {
        return num[0];
    }
}
