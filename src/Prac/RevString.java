package Prac;

public class RevString {
    public static void main(String[] args) {
        String str="pop";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
           rev= rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("pal");
        }
        else {
            System.out.println("not pal");
        }
    }
}
