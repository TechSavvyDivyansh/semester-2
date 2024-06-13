// exp 8 b


// final class A->shows error
final class A
{
    final int a=5; 

}
class B extends A   // The type B cannot subclass the final class A
{
     
    final void display()
    {
        a=10;      //a cannot be resolved to a variable
        System.out.println("a:"+a);
    }
}
class C extends A    //The type C cannot subclass the final class A
{
    void display()
    {
        System.out.println("hello");
    }
}
public class FinalKeyword 
{
      public static void main(String[] args) {
        B obj=new B();
        obj.display();
      }
}

// This code is written to show errors (final variable cannot be changed and final class cannot be inherited)