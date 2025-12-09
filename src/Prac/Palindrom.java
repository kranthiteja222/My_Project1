package Prac;

public class Palindrom {
    public static void main(String[] args) {
        int a=1221;
        int c=a;
        int b=0;
        int rem=0;
        while(a !=0 ) {
            rem = a % 10;
            b = b * 10 + rem;
            a = a / 10;
        }
        if(c==b){
            System.out.println("pal");
        }
    }
}
