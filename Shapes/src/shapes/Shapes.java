package shapes;
import java.util.Scanner;
class Area{
   double cr(double r)
   {
       
       double result = (3.14*r*r);
       return result;
   }
   double sq(double a)
   {
       
       double result = a*a;
       return result;
   }
   double rec(double l,double b)
   {
       return l*b;
   }
   double tri(double h,double b)
   {
       return (1*b*h)/2;
   }
   
}
public class Shapes {

    public static void main(String[] args) {
       
        System.out.print("Enter the shape Character : ");
        Scanner shape = new Scanner(System.in);
        char name;
        name = shape.next().charAt(0);
        Scanner input = new Scanner(System.in);
        Area outp = new Area();
        
        if(name == 'C' || name == 'c')
        {
            System.out.print("Enter radius :");
            double r=input.nextInt();
            double net = outp.cr(r);
            System.out.println(net);
        }
        else if(name == 'S' || name == 's')
        {
            System.out.print("Enter Length :");
            double a=input.nextInt();
            double net = outp.sq(a);
            System.out.println(net);
        }
        else if(name == 'R' || name == 'r')
        {
            System.out.print("Enter Length :");
            double l=input.nextInt();
            System.out.print("Enter Breadth :");
            double b=input.nextInt();
            double net = outp.rec(l,b);
            System.out.println(net);
        }
        else if(name == 'T' || name == 't')
        {
            System.out.print("Enter Height :");
            double h=input.nextInt();
            System.out.print("Enter Base :");
            double b=input.nextInt();
            double net = outp.tri(h,b);
            System.out.println(net);
        }
    }
    
}
