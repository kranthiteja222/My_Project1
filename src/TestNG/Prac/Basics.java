package TestNG.Prac;

import org.testng.annotations.*;

public class Basics {

    @Test
    public void Demo()
    {
         System.out.println("Hello");
    }

    @Test(groups = {"smoke"})
    public void Demo1(){
        System.out.println("Demo1");
    }
    @Test
    public void Test1(){
        System.out.println("DemoTest");
    }

    @BeforeTest
    public void url()
    {
        System.out.println("URL");
    }

    @AfterTest(groups = "smoke")
    public void ClickSubmit()
    {
        System.out.println("submit");
    }
    @BeforeSuite
    public void launchSele()
    {
        System.out.println("launed");
    }

    @AfterSuite
    public void close()
    {
        System.out.println("Close");
    }

}
