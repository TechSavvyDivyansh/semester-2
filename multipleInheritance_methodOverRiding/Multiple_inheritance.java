// exp 8 a


import java.util.*;
class Student
{
    Scanner in=new Scanner(System.in);
    int rollno;
    public void read()
    {
        System.out.println("Enter roll no.");
        rollno=in.nextInt();
    }
}
class Test extends Student
{
     int sem1_marks,sem2_marks;
     public void read()
     {
         super.read();
         System.out.println("Enter sem 1 marks");
         sem1_marks=in.nextInt();
         System.out.println("Enter sem 2 marks");
         sem2_marks=in.nextInt();

     }
}
class Result extends Test implements Sports
{
    int total;
    void display()
    {
        System.out.println("Roll no:"+rollno);
        System.out.println("Sem-1 marks:"+sem1_marks);
        System.out.println("sem-2 marks:"+sem2_marks);
        System.out.println("Total:"+(sem1_marks+sem2_marks+score()));
    }
    
}
interface Sports 
{
    Scanner in=new Scanner(System.in);
      default int score()
      {
          System.out.println("Enter sports marks");
          return (in.nextInt());
      } 
 }

 class Multiple_inheritance
 {
    public static void main(String[] args) {
        Result obj=new Result();
        obj.read();
        obj.display();
    }
 }