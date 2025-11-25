package Arrays;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        // lets learn how to declare an ArrayList

        ArrayList<String> arr= new ArrayList<String> ();
        arr.add("teja");
        arr.add("utti");
        arr.add("Kranthi");
        arr.add("ANusha");

        for(String a : arr)
        {
            System.out.println(a);
        }

        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }


    }

}
