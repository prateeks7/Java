package nested.pkginterface;
interface Shape{
    double getArea(double x);
    interface Display{
        public void show();
    }
}
class NestedInterface1 implements Shape,Shape.Display
{
    public double getArea(double x)
    {
        double area = 3.14*x*x;
        return area;
    }
    public void show()
    {
        System.out.println("Hello");
    }
}
public class NestedInterface {
public static void main(String[] args) {
     Shape.Display d = new NestedInterface1();
     Shape s = new NestedInterface1();
     d.show();
     System.out.println("Area is = "+s.getArea(4.0));
}
    
}
