package Prac;

public class ArmStrongNum {
    public static void main(String[] args) {
        int a=153, b=0,c=0;
        int rem=0;
        while(a != 0) {
            rem = a%10;
            b=rem * rem * rem;
            c=b+c;
            a=a/10;
        }
        System.out.println(c);
        }
}
