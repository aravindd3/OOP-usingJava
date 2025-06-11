import java.util.Scanner;
abstract class Shape
{
    public abstract double area();
}
 class circle extends Shape
{
    double radius;
     circle(double r)
    {
        this.radius=r;
    }
    public double area()
    {
        return 3.14*radius*radius;
    }

}
 class rectangle extends Shape
{
 double length,breadth;
  rectangle(double l,double b)
 {
    this.length=l;
    this.breadth=b;
 }
 public double area()
 {
    return 2*length*breadth;
 }
}
public class Abstractex
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter 1 to find area of CIRCLE, 2 for RECTANGLE ,3 for EXIT");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("enter the radius of the circle:");
            double rad=sc.nextDouble();
            circle obj1=new circle(rad);
            System.out.println("the area of the circle is "+obj1.area());
        }
        if(n==2)
        {
            System.out.println("enter the length of rectangle:");
            double len=sc.nextDouble();
            System.out.println("enter the breadth of the rectangle:");
            double bre=sc.nextDouble();
            rectangle obj2=new rectangle(len,bre);
            System.out.println("the area of the rectangle is "+obj2.area());
        }
        if(n==3)
        {
            System.out.println("EXITED SUCCESFULLY!");
            return;
        }
        }
        
        
        
        
    }
}

