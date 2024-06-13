/* Write a multithreaded program that calculates various statistical values for a list of 
numbers. This program should read values in an array and will then create three separate 
worker threads. One thread will determine the average of the numbers, the second will 
determine the maximum value, and the third will determine the minimum value. For 
example, suppose your program is passed the integers
90 81 78 95 79 72 85
The program will report
The average value is 82
The minimum value is 72
The maximum value is 95 */

import java.util.*;


class Max extends Thread
{
    int max;
     Max(int m[])
     {
         max=m[0];
         for(int i=0;i<10;i++)
         {
              if(m[i]>max)
              {
                max=m[i];
              }
         }
     }
     public void run()
     {
         System.out.println("Maximum number is:"+max);
     }
   
}
class Min extends Thread
{
    int min;
     Min(int m[])
     {
         min=m[0];
         for(int i=0;i<10;i++)
         {
              if(m[i]<min)
              {
                min=m[i];
              }
         }
     }
     public void run()
     {
         System.out.println("Minimum number is:"+min);
     }
     
}
class Average extends Thread
{
    double sum=0.0, average;
     Average(int m[])
     {
         
         for(int i=0;i<10;i++)
         {
              sum=sum+m[i];
         }
     }
     public void run()
     {
         System.out.println("Sum:"+sum);
         System.out.println("Average:"+(double)(sum/10.0));
     }
     
}
public class Arraymulti 
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m[]=new int[10];
        int i;
        for(i=0;i<10;i++)
        {
            m[i]=in.nextInt();
        }
        Max obj1=new Max(m);
        Min obj2=new Min(m);
        Average obj3=new Average(m);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
