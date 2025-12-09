package Prac;

public class Fibonacci {
    public static void main(String[] args) {
        int prev = 0;
        int curr = 1;

        for (int j = 0; j < 15; j++) {
            System.out.print(prev+" "+curr+" ");
            prev = prev + curr;
            curr = prev + curr;
        }

    }
}
