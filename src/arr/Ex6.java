package arr;

public class Ex6 {
    public static void main(String[] args) {
        Ex6 m = new Ex6();
        int[] valores = {5, 2, 6};
        int result = m.getLastElement(valores);
        System.out.println(result);

    }

    public int getLastElement(int[] num) {
        return (num[num.length-1]);
    }
}
