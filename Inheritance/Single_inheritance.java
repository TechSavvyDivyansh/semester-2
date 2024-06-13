// exp 7a

class A
{
    A()
    {
        System.out.println("class A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("class B");
    }
}
class C extends B
{
    C()
    {
        System.out.println("class C");
    }
}

class Single_inheritance
{
    public static void main(String[] args) {
          C obj=new C();
    }
}