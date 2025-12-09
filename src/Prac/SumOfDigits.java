package Prac;

public class SumOfDigits {
    public static void main(String[] args) {
        int a= 456,b=0,c=0;
        int rem;
        while(a != 0)
        {
            rem = a % 10;
            b = b * 10 + rem;
            a = a / 10;
            c= c+rem;
        }
        System.out.println(c);
    }
}
