package Arrays;

public class LaregNumArray {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>b)
            {
                b=a[i];
            }
        }
        System.out.println(b);
    }
}
