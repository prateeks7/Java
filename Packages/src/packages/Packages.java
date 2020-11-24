package packages;
import packages.newp.inclass;
public class Packages {
    public static void main(String[] args) {
        int i=6,j=0,k;
        try
        {
            k=i/j;
        }
        catch(ArithmeticException e)
        {
          System.out.print("e="+e);
        }
    }
    
}
