
package pro;

import java.util.Scanner;
public class Pro {
    
    static class Prod
    {
        Scanner nos = new Scanner(System.in);
        
        int a = nos.nextInt();
        int b = nos.nextInt();
        int c ()
                {
                   return a*b;
                }
    }
    public static void main(String[] args) {
        
        System.out.print("Enter 2 numbers :");
        
        Prod product = new Prod();
        int Ans =  product.c();
         
        System.out.print(Ans);
        
        
       
        
       
    
    }
    
}
