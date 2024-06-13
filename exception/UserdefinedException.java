import java.util.*;
public class UserdefinedException 
{
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter fare price");
         int fare;
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
         System.out.println("Ticket booked succesfully");

     }
}

class ErrorException extends Exception
{
    ErrorException()
    {
         System.out.println("Invalid Fare entry ticket cannot be booked. Please try again");
    }
}