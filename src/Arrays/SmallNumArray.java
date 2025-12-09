package Arrays;

public class SmallNumArray {

        public static void main(String[] args) {
            int a[] = {20,10,30,40,50};
            int b=a[0];
            for(int i=0;i<a.length;i++)
            {
                if(a[i]<b)
                {
                    b=a[i];
                }
            }
            System.out.println(b);
        }
    }



