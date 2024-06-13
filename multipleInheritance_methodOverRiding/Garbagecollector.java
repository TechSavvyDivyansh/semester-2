// exp 8 d

class Garbage
{
    protected void finalize() throws Throwable
    {
          System.out.println("Object deleted");
    }
}

public class Garbagecollector 
{
     public static void main(String[] args) {
        Garbage obj=new Garbage();
        System.out.println("Object created");
        obj=null;
        System.gc();
        System.out.println("Object deletion requested");

     }
}
