package even.or.odd;
import java.util.*;
public class EvenOrOdd {

    public static void main(String[] args) {
        
        Scanner nos = new Scanner(System.in);
        int a;
        a = nos.nextInt();
        if(a%2 == 0)
        {
            System.out.println("Even");
        }
        else if(a%2 != 0)
        {
            System.out.println("Odd");
        }
    }
    
}
