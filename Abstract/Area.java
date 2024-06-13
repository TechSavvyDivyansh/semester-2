// Write an abstract class program to calculate area of circle, rectangle and triangle.
import java.util.*;
abstract class Ar
{
    static Scanner in=new Scanner(System.in);
     abstract void read();
     double ar;
     void display()
     {
          System.out.println("area:"+ar);
     }

}
class Circle extends Ar
{
    void read()
    {
         System.out.println("Enter the radius of the circle nowww ");
         int r = in.nextInt();
         ar = 3.14 * r * r;
    }
}

class Rectangle extends Ar
{
    void read()
    {
        System.out.println("Enter the length and breadth of the rectangle nowww ");
         int l = in.nextInt();
         int b = in.nextInt();
         ar = l*b;
    }
}
class Square extends Ar
{
    void read()
    {
        System.out.println("Enter the side of the square nowww ");
         int s = in.nextInt();
         ar = s*s;
    }
}

class Area
{
    public static void main(String[] args) 
    {
        Circle obj1=new Circle();
        Rectangle obj2=new Rectangle();
        Square obj3=new Square();
        obj1.read();
        obj2.read();
        obj3.read();
        obj1.display();
        obj2.display();
        obj3.display();


    }
}