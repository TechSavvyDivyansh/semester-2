
class Hello
{
    Hello()
    {
       System.out.println("This is constructor 1");
    }
    void f1()
    {
        System.out.println("This is function 1");
    }
}
class Hello2 extends Hello
{

    Hello2()
    {
        System.out.println("This is constructor 2");
    }
    void f2()
    {
        System.out.println("This is fn 2");
    }
}
public class BasicThreading 
{
    public static void main(String[] args) {
        Hello2 obj=new Hello2();
        
    }
}
