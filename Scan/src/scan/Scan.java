package scan;
import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
            int n;
           n = input.nextInt();    
        System.out.println("The Number You Entered : "+n);
    }
    
}
