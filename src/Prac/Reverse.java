package Prac;

public class Reverse {

    public static void main(String[] args) {
        int a=1234;
        int b=0;
        int rem;
        while(a !=0) {
            rem = a % 10;
            b = b * 10 + rem;
            a = a / 10;
        }
        System.out.println(b);
    }

}
