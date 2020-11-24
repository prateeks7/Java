package calculator;
import java.util.*;
public class Calculator {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
           int a;
           char b;
           int c;
           
        a = input.nextInt();
        b = input.next().charAt(0);
        c = input.nextInt();
        
        if(b == '+')
        {
           System.out.println(a+c);
        }
        else if(b == '-')
        {
           System.out.println(a-c);
        }
        else if(b == '*')
        {
           System.out.println(a*c);
        }
        else if(b == '/')
        {
           System.out.println(a/c);
        }
        else if(b == '%')
        {
           System.out.println(a%c);
        }
        
    }
    
}
