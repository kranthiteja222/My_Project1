package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int a[]={12, 2,92, 82,75,99,66,105};
        int Lrgest=Integer.MIN_VALUE, SecondLarg=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
                if(a[i]>Lrgest)
                {
                    SecondLarg=Lrgest;
                    Lrgest=a[i];
                } else if(a[i]>SecondLarg && a[i] != Lrgest){

                        SecondLarg=a[i];
                    
                }
        }
        System.out.println(Lrgest +","+SecondLarg);


    }
}