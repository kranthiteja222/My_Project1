package Arrays;

public class Java {

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        for(int i:a)
        {
            System.out.println(i);
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
