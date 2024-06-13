// WAP to prevent concurrent booking of a ticket using the concept of thread synchronization.

import java.util.*;
class Bookticket
{
    Scanner in=new Scanner(System.in);
    synchronized public void bookticket()
    {
        int fare;
        try 
        {
            System.out.println("Enter ticket fare");
            fare=in.nextInt();
            try {
            if(fare<=500)
            {
                throw new ErrorException();
            }
            } catch (ErrorException e) {
               // System.out.println(e);
               System.exit(0);
   
            }
            System.out.println("Wait your ticket is in booking progress");
            for(int i=0;i<5;i++)
            {
                System.out.print("..\t");
                Thread.sleep(500);
            }
        } 
        catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
        System.out.println();
        System.out.println("Your ticket is booked successfully");
    }
}

class ErrorException extends Exception
{
    ErrorException()
    {
         System.out.println("Invalid Fare entry ticket cannot be booked. Please try again");
    }
}
class Passenger extends Thread
{
      Bookticket progressticket;
      Passenger(Bookticket ticket)
      {
           this.progressticket=ticket;
      }
      public void run()
      {
           progressticket.bookticket();
      }
}

class Ticketbooking
{
    public static void main(String[] args) {
        Bookticket obj=new Bookticket();
        Passenger t1=new Passenger(obj);
        Passenger t2=new Passenger(obj);
        Passenger t3=new Passenger(obj);
        t1.start();
        t2.start();
        t3.start();
    }
}