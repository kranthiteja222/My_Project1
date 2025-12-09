//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       int a=163;
       int val=0;
       for(int i=2;i<=Math.sqrt(a);i++)
       {
           if(a%i==0)
           {
               val=1;
               break;
           }
           else {
               val = 0;
           }
       }

       if(val ==0)
       {
           System.out.println("Prime");
       }
       else {
           System.out.println("Not Prime");
       }

        }
}