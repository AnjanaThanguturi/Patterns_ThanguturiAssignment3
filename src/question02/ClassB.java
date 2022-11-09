package question02;

class A {
    protected void method()
    {
        System.out.println("Hello");
    }
}
 
public class B extends A {
 
    // Compile Time Error
    void method()
    {
        System.out.println("Hello");
    }
 
    public static void main(String args[])
    {
        B b = new B();
        b.method();
    }
}