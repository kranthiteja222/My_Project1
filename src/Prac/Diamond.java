package Prac;

public class Diamond {
    public static void main(String[] args) {
        int a=5;
        for(int i=0;i<5;i++) {
            for (int j = a - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int l=0;l<a;l++)//rows
        {
        for(int j=1;j<=l;j++){
            System.out.print(" ");
        }
       for(int k=(2*a)-1;k>l*2;k--)
       {
           System.out.print("*");
       }
            System.out.println("");
        }

    }
}
