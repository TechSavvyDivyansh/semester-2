// a.	Write a multithreaded program a java program to print Table of Five, Seven and Thirteen using Multithreading (Use Thread class for the implementation). 

class Five extends Thread
{
    public void run()
    {
         
         for(int i=0;i<10;i++)
         {
            System.out.println("5*"+i+"="+(5*i));
         }
    }
}
class Seven implements Runnable
{
     public void run()
    {
         
         for(int i=0;i<10;i++)
         {
            System.out.println("7*"+i+"="+(7*i));
         }
    }
}
class Thirteen extends Thread
{
    public void run()
    {
         
         for(int i=0;i<10;i++)
         {
            System.out.println("13*"+i+"="+(13*i));
         }
    }
}

class Table
{
    public static void main(String[] args) {
        Five t1=new Five();
        Seven th=new Seven();
        Thread t2=new Thread(th);
        Thirteen t3=new Thirteen();
        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(5);

        t1.start();
        t2.start();        
        t3.start();
    }
}