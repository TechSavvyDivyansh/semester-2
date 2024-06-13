// WAP to create a package called vol having Cylinder class and volume (). WAP that imports this package to calculate volume of a Cylinder.

import Vol.*;
import java.util.*;

public class Volume 
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Cylinder obj=new Cylinder();
        System.out.println("Enter the radius and height of cylinder");
        int r,h;
        r=in.nextInt();
        h=in.nextInt();
        obj.volume(r,h);

    }
}
