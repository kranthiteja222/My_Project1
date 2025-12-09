package TestNG.Prac;

import org.testng.annotations.Test;

public class Basics2 {


    @Test(groups = {"smoke"})
    public void Demo1()
    {
        System.out.println("Test1");
    }


    @Test
    public void Demo2()
    {
        System.out.println("Test2");
    }
}
