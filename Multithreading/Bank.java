/*Write a Java program that creates a bank account with concurrent deposits and withdrawals 
using threads. */
import java.util.*;


class Deposits 
{
    Scanner in=new Scanner(System.in);
    synchronized public void deposit()
    {
        int deposit;
        try 
        {
            
            deposit=in.nextInt();
            System.out.println("Wait deposit process is in progress");
            for(int i=0;i<5;i++)
            {
                System.out.print("..\t");
                Thread.sleep(200);
            }
              
        } catch (Exception e) {
            System.out.println("Deposit failed");
            System.exit(0);
        }
        System.out.println();
        System.out.println("Money is successfully deposited!!!");
    }
}
class Withdrawals
{
     Scanner sc=new Scanner(System.in);
     synchronized public void withdraw()
     {
          int withdraw;
          try {
            
            withdraw=sc.nextInt();
            System.out.println("Wait withdrawal is in progress");
            for(int i=0;i<5;i++)
            {
                System.out.print("..\t");
                Thread.sleep(200);
            }
            
          } catch (Exception e) {
            // TODO: handle exception
          }
          System.out.println();
          System.out.println("Money withdrawn successfully!!");
     }
     
}
class Customer extends Thread
{
    Deposits dep;
    Withdrawals wt;
    Customer(Deposits dp,Withdrawals wth)
    {
        this.dep=dp;
        this.wt=wth;
    }
    public void run()
    {
         dep.deposit();
         wt.withdraw();
    }
}
public class Bank 
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter the amount you want to deposit");
        final Deposits obj=new Deposits();
        System.out.println("Enter the amount to be withdrawn");
        final Withdrawals obj2=new Withdrawals();
        Customer t1=new Customer(obj,obj2);
        // Customer t2=new Customer(obj,obj2);

        t1.start();
        t1.join();
        // t2.start();10


    }
}
