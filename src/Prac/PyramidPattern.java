package Prac;

public class PyramidPattern {
    public static void main(String[] args) {
        int a=5;
        for(int i=0;i<=a;i++)
        {
            for(int j=(a-i);j>0;j--) {
                System.out.print(" ");
            }
                for (int k = 1; k<= 2*i-1; k++) {
                    System.out.print("*");
                }
            System.out.println("");
        }


    }

}
