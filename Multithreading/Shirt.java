import java.util.*;


class AddtoCart
{
    Scanner in=new Scanner(System.in);
    int shirtno;
    synchronized public void cart()
    {
        try {
            try {
            char option;
            System.out.println("Enter y if you want to add product to cart or else n");
            option=in.next().charAt(0);
            if(option=='n')
            {
                throw new CartException();
            }
            System.out.print("Enter the shirt number you are willing to add:");
            shirtno=in.nextInt();
            for(int i=0;i<=5;i++)
            {
                System.out.print("..\t");
                Thread.sleep(500);
            }            

        } catch (CartException e) {
            System.exit(0);
            
        }
        } catch (Exception e) {
            
        }
    }
}

class CartException extends Exception
{
    CartException()
    {
        System.out.println("Ok np. see you next Time");
    }
}


class Customer extends Thread
{
    AddtoCart add;
    Customer(AddtoCart ob)
    {
        this.add=ob;
    }
    public void run()
    {
        add.cart();
    }
}


public class Shirt 
{
    public static void main(String[] args) {
        AddtoCart obj=new AddtoCart();
        Customer t1=new Customer(obj);
        Customer t2=new Customer(obj);
        t1.start();
        t2.start();
        
    }
}