package arr;

public class Ex5 {

    public static void main(String[] args) {
        Ex5 a= new Ex5();
          int [] values ={1,2};

        a.setFirstElement(values,3);
        for (int i=0;i<values.length;i++){
            System.out.print(values[i]+" ");
        }
    }

    public int setFirstElement(int[] a, int b) {

        int set = a[0] = b;

        return set;
    }
}
