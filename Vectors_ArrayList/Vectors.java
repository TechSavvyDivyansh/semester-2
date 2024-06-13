import java.util.*;
class Vectors
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,k,n;
        Vector<Integer> vec=new Vector<>();
        i=1;
        while(i!=0)
        {
            vec.add(in.nextInt());
            System.out.println("Do you want to add more numbers?Enter 1 for yes and 0 for no");
            i=in.nextInt();
        }
        System.out.println("Vector:"+vec);
        System.out.println("Do you want to delete any element?enter 1 for yes and 0 for no");
        k=in.nextInt();
        switch(k)
        {
            case 1:
            {
                System.out.println("Enter the index of element to be removed");
                n=in.nextInt();
                vec.removeElementAt(n);
                break;
            }
            case 0:
            {
                System.out.println("Okay no element deleted");
                break;
            }
            default:
            {
                System.out.println("Wrong choice");
            }


        }
       System.out.println("Final collection");
       System.out.println(vec);
       for(i=0;i<vec.size();i++)
       {
         System.out.println(vec.elementAt(i));
       }


    }
}