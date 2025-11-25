public class MethodsDemo {

    public static void main(String[] args) {
        // let's learn methods
        MethodsDemo m1= new MethodsDemo();
        m1.method1();
        m1.method2();
        method3();

    }
    // this is void method, so there will be no return type
    public void method1()
    {
        System.out.println("method 1");
    }
    // this is Int method , so it should have return type, if no return it will through error
    public int method2()
    {
        System.out.println("lets count nums");
        return 10+20;
    }
    // this is Static method,If we create  static method then it will become class level ,

    public static void method3()
    {
        System.out.println("this is method 3");
    }

}
