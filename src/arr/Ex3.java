package arr;

public class Ex3 {
    public static void main(String[] args) {
        Ex3 m = new Ex3();
        m.toArray(5, 9);
    }

    public int[] toArray(int a, int b) {
        int [] res= new int[2];
        res[0]=a;
        res[1]=b;

        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        return res;
    }

}
